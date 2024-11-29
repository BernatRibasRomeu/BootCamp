import React, { useState, useEffect } from "react";
import PokemonCard from "./components/PokemonCard";
import PokemonSearch from "./components/PokemonSearch";

const App: React.FC = () => {
  const [pokemonIds, setPokemonIds] = useState<number[]>([]); // Estado que contiene un array de números.

  useEffect(() => {
    const generateRandomIds = (): number[] => {
      const ids = new Set<number>();
      while (ids.size < 20) {
        ids.add(Math.floor(Math.random() * 151) + 1);
      }
      return Array.from(ids);
    };

    setPokemonIds(generateRandomIds());
  }, []);

  return (
    <>
    <h1 className="text-center text-2xl font-bold text-purple-800">Pokedex amb React</h1>
      <div className="flex items-center justify-center">
      <PokemonSearch />
    </div>
      <div className="grid grid-cols-5 gap-4 p-4 max-w-4xl mx-auto">
        {pokemonIds.map((id) => (
          <PokemonCard key={id} pokemonId={id} />
        ))}
      </div>
    </>
  );
};

export default App;