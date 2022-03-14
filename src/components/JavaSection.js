import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function JavaSection(){
    return (
        <div className={"d-flex flex-row justify-content-start w-50"}>
            <Skill
                title="Java"
                description="I'm the most comfortable with java, have gotten familiar with its libraries over the past 3 years"
                color="darkorange"
            />
            <Project 
                image="/project-thumbnails/usaco.png"
                link="https://drive.google.com/drive/folders/1nVCAhWkO-BFG1f823Mz15sWvTBqKj1A1?usp=sharing"
                name="USACO"
                description="Solve complex programming problems in Java with time and space constraints, using knowledge of data structures, algorithms, and math. 
                I'm in the gold division"
            />
            <Project
                image="/project-thumbnails/campuspaths.png"
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
        </div>
    )
}

export default JavaSection