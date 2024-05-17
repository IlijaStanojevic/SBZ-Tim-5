
import {
    Button,
    MenuItem, Paper,
    Select,
    Stack,
    Table, TableBody,
    TableCell,
    TableContainer, TableHead,
    TableRow,
    TextField,
    Tooltip
} from "@mui/material";
import {useState} from "react";
import backgroundImage from "../resources/eu4background.jpg"


const Home = () => {
    const [selectedStyle, setSelectedStyle] = useState('');
    const [selectedContinent, setSelectedContinent] = useState('');
    const [selectedAchievement, setSelectedAchievement] = useState('');
    const [difficulty, setDifficulty] = useState(0);
    const [missions, setMissions] = useState(0);
    const [errorMessage, setErrorMessage] = useState('');
    const [results, setResults] = useState([]);
    const [styles] = useState([
        { id: '1', name: 'Aggressive' },
        { id: '2', name: 'Passive' },
        { id: '3', name: 'Style 3' },
        { id: '4', name: 'Style 4' },
    ]);
    const [achievements] = useState([
        { id: '1', name: 'Achievements 1' },
        { id: '2', name: 'Achievements 2' },
        { id: '3', name: 'Achievements 3' },
        { id: '4', name: 'Achievements 4' },
    ]);
    const [continents] = useState([
        { id: '1', name: 'Asia' },
        { id: '2', name: 'Europe' },
        { id: '3', name: 'Africa' },
        { id: '4', name: 'North America' },
    ]);
    const sendSubmitRequest = async (selectedStyle, difficulty, missions, selectedAchievement, selectedContinent) => {
        try {
            const response = await fetch('http://localhost:8080/api/results', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({
                    selectedStyle,
                    difficulty,
                    missions,
                    selectedAchievement,
                    selectedContinent
                }),
            });

            if (!response.ok) {
                throw new Error('Network response was not ok');
            }

            const data = await response.json();
            console.log('Success:', data);
            return data;
        } catch (error) {
            console.error('Error sending request:', error);
        }
    };




    const handleSubmit = async (event) => {
        event.preventDefault();
        setErrorMessage("");

        try {
            const data = await sendSubmitRequest(selectedStyle, difficulty, missions, achievements, continents);
            const resultsArray = Object.entries(data)
                .filter(([key]) => key.startsWith('name'))
                .map(([key, value], index) => ({
                    name: value,
                    score: data[`score${index + 1}`]
                }))
                .sort((a, b) => b.score - a.score);

            setResults(resultsArray);
            console.log('Request successful:', resultsArray);
        } catch (error) {
            setErrorMessage('Failed to send request. Please try again.');
        }
    };

    return (
        <div style={{
            backgroundImage: `url(${backgroundImage})`, // Set the background image
            backgroundSize: 'cover', // Cover the entire container
            backgroundPosition: 'center', // Center the image
            minHeight: '100vh', // Set minimum height to fill the screen
            display: 'flex',
            flexDirection: 'column',
            justifyContent: 'center',
            alignItems: 'center',
        }}>
            <form onSubmit={handleSubmit}>

                <Stack
                    direction="column"
                    justifyContent="flex-start"
                    alignItems="center"
                    spacing={2}
                >
                    <h1>Choose the EU4 country for you</h1>
                    <div>
                        <Select
                            id="style"
                            label="Style"
                            value={selectedStyle}
                            required
                            onChange={(e) => setSelectedStyle(e.target.value)}
                            displayEmpty
                        >
                            <MenuItem value="" disabled>
                                Please select a style
                            </MenuItem>
                            {styles.map((style) => (
                                <MenuItem key={style.id} value={style.id}>
                                    {style.name}
                                </MenuItem>
                            ))}
                        </Select>
                    </div>
                    <div>
                        <Select
                            id="continent"
                            label="continent"
                            value={selectedContinent}
                            required
                            onChange={(e) => setSelectedContinent(e.target.value)}
                            displayEmpty
                        >
                            <MenuItem value="" disabled>
                                Please select a continent
                            </MenuItem>
                            {continents.map((style) => (
                                <MenuItem key={style.id} value={style.id}>
                                    {style.name}
                                </MenuItem>
                            ))}
                        </Select>
                    </div>
                    <div>
                        <Select
                            id="achievements"
                            label="achievements"
                            value={selectedAchievement}
                            required
                            onChange={(e) => setSelectedAchievement(e.target.value)}
                            displayEmpty
                        >
                            <MenuItem value="" disabled>
                                Please select achievements
                            </MenuItem>
                            {achievements.map((style) => (
                                <MenuItem key={style.id} value={style.id}>
                                    {style.name}
                                </MenuItem>
                            ))}
                        </Select>
                    </div>
                    <div>
                        <TextField
                            autoFocus
                            required
                            margin="normal"
                            id="difficulty"
                            label="Difficulty:"
                            type="number"
                            variant="standard"
                            InputProps={{ inputProps: { min: 1, max: 3 } }}
                            value={difficulty}
                            onChange={(e) => {
                                setDifficulty(e.target.value);
                            }}
                        />
                    </div>
                    <div>
                        <TextField
                            autoFocus
                            required
                            margin="normal"
                            id="missions"
                            label="Missions:"
                            type="number"
                            variant="standard"
                            InputProps={{ inputProps: { min: 1, max: 3 } }}
                            value={missions}
                            onChange={(e) => {
                                setMissions(e.target.value);
                            }}
                        />
                    </div>
                    <div>
                        <Tooltip title="SUBMIT">
                                    <span>
                                        <Button type="submit"
                                                fullWidth
                                                variant="contained"
                                                size="large"
                                        >SUBMIT</Button>
                                        {errorMessage && <p style={{ color: 'red' }}>{errorMessage}</p>}
                                    </span>
                        </Tooltip>
                    </div>
                    <div>
                        <TableContainer component={Paper}>
                            <Table sx={{ minWidth: 650, backgroundColor: 'transparent'}} aria-label="simple table">
                                <TableHead>
                                    <TableRow>
                                        <TableCell>Country)</TableCell>
                                        <TableCell align="right">Score</TableCell>
                                    </TableRow>
                                </TableHead>
                                <TableBody>
                                    {results.map((result, index) => (
                                        <TableRow
                                            key={index}
                                            sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
                                        >
                                            <TableCell component="th" scope="row">
                                                {result.name}
                                            </TableCell>
                                            <TableCell align="right">{result.score}</TableCell>
                                        </TableRow>
                                    ))}
                                </TableBody>
                            </Table>
                        </TableContainer>
                    </div>

                </Stack>

            </form>
        </div>


    )
}
export default Home