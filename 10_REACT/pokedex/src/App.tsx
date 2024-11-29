import React from "react";
import PokemonSearch from "./components/PokemonSearch";
import Pagination from "./components/Pagination";

const App: React.FC = () => {

  return (
    <>
      <h1 className="text-center text-2xl font-bold text-purple-800">Pokedex amb React</h1>
      <div className="flex items-center justify-center">
        <PokemonSearch />
      </div>
      <div>
      <Pagination totalPages={8} />
    </div>
    </>
  );
};

export default App;
