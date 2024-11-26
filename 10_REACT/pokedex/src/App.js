import React, { useState, useEffect } from "react";
import PokemonCard from "./components/PokemonCard";

function App() {
  const [pokemonIds, setPokemonIds] = useState([]);

  useEffect(() => {
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
      <div className="grid grid-cols-5 gap-4 p-4 max-w-4xl mx-auto">
        {pokemonIds.map((id) => (
          <PokemonCard key={id} pokemonId={id} />
        ))}
      </div>
  );
}

export default App;