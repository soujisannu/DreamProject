// src/firebase.js

import { initializeApp } from "firebase/app";
import { getFirestore } from "firebase/firestore";
import { getAuth } from "firebase/auth";

// Firebase configuration from Firebase Console
const firebaseConfig = {
  apiKey: "AIzaSyC1Sp1FOmZffrMAZ1gekLJHYo4ah3MOEpY",
  authDomain: "tailoring-app-dda36-6148e.firebaseapp.com",
  projectId: "tailoring-app-dda36-6148e",
  storageBucket: "tailoring-app-dda36-6148e.firebasestorage.app",
  messagingSenderId: "1038689143931",
  appId: "1:1038689143931:web:5d7e66bd6313a27dd066de",
  measurementId: "G-L3XZF0HN6G"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);

// Initialize Firestore and Authentication
const db = getFirestore(app);
const auth = getAuth(app);

// Export Firebase services
export { db, auth };
