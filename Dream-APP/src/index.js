import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter } from "react-router-dom"; // Only here, no need in App.js
import App from "./App";
import ErrorBoundary from "./ErrorBoundary"; // Import the ErrorBoundary here
import "./global.css";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <BrowserRouter>
    <ErrorBoundary>
      <App />
    </ErrorBoundary>
  </BrowserRouter>
);
