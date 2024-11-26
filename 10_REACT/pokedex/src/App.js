import React, { useState, useEffect } from "react";
import PokemonCard from "./components/PokemonCard";

function App() {
    const [pokemonIds, setPokemonIds] = useState([]);

    useEffect(() => {
        // Genera 20 IDs aleatorias únicas entre 1 y 151
        const generateRandomIds = () => {
            const ids = new Set();
            while (ids.size < 20) {
                ids.add(Math.floor(Math.random() * 151) + 1);
            }
            return Array.from(ids);
        };

        setPokemonIds(generateRandomIds());
    }, []);

    return (
        <div style={styles.grid}>
            {pokemonIds.map((id) => (
                <PokemonCard key={id} pokemonId={id} />
            ))}
        </div>
    );
}

// Estilos para el contenedor
const styles = {
    grid: {
        display: "grid",
        gridTemplateColumns: "repeat(5, 1fr)", // 5 columnas
        gap: "16px", // Espacio entre tarjetas
        padding: "16px",
    },
};

export default App;
