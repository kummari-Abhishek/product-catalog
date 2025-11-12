import React from "react";
import ProductList from "./components/ProductList";
import NavBar from "./components/NavBar";
import "./App.css";  
const App = () => {
  return (
   <div>
      <NavBar />
      <ProductList />
    </div>
  );
};

export default App;
