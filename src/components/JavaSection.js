import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function JavaSection(){
    return (
        <div className={"d-flex flex-row justify-content-start"}>
            <Skill
                title="Java"
                description="I'm the most comfortable with java, have gotten familiar with its libraries over the past 3 years"
                color="darkorange"
            />
            <Project
                image="/project-thumbnails/campuspaths.png"
                link="https://campuspaths-website.herokuapp.com/"
                name="Campus Paths"
                description="A web app which uses Dijkstra's and then draws the shortest path between 2 buildings at the UW. 
                Implemented the backend using a Spark Java server and the front end with React"
            />
            <Project
                image="/project-thumbnails/mazegenerator.png"
                link="/mazeapp.jar"
                name="Maze Generator"
                description="An app which generates a solveable maze using Kruskals algorithm to ensure start and end are connected, using randomized weights between rooms to create a random looking maze. 
                Can also solve the maze using dijkstra's algorithm"
            />
            <Project 
                image="/project-thumbnails/sudoku.png"
                link="https://github.com/jamesm62/sudokusolver"
                name="Sudoku Master"
                description="A web app I made with a couple friends which solves and generates sudoku puzzles using Java. 
                I created the front end which calls the API endpoints and displays the information."
            />
            <Project 
                image="/project-thumbnails/usaco.png"
                link="https://drive.google.com/drive/folders/1nVCAhWkO-BFG1f823Mz15sWvTBqKj1A1?usp=sharing"
                name="USACO"
                description="Solve complex programming problems in Java with time and space constraints, using knowledge of data structures, algorithms, and math. 
                I'm in the gold division"
            />
        </div>
    )
}

export default JavaSection