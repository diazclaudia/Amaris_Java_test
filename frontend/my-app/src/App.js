import logo from "./logo.svg";
import "./App.css";
import { useEffect } from "react";
import FormData from "./Form";
import Menu from "./Menu";


function App() {
  // You can skip useEffect if you're not using TailwindCSS
  // Otherwise, for the production usage refer to https://tailwindcss.com/docs/installation
  useEffect(() => {
    if (document) {
      const stylesheet = document.createElement("link");
      stylesheet.rel = "stylesheet";
      stylesheet.href = "https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css";

      document.head.appendChild(stylesheet);
    }
  }, []);

  return (
    <div className="App">
      <Menu />
  
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <div className="py-6">
          <FormData />
        </div>
      </header>
    </div>
  );
}

export default App;