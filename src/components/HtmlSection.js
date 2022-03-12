import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function htmlcssSection(){
    return (
        <div className={"d-flex flex-row justify-content-start w-50"}>
            <Skill
                title="HTML/CSS/JS"
                description="I've worked on the front end in 2 team projects and have a basic understanding of html and css"
                color="gold"
            />
            <Project 
                image="/project-thumbnails/sudoku.png"
                link="https://github.com/jamesm62/sudokusolver"
                name="Sudoku Master"
                description="A web app I made with a couple friends which solves and generates sudoku puzzles. 
                I created the front end, allowing intuitive use and displaying information from the API endpoints. Follow the readme if you wanna use it!"
            />
            <Project 
                image="/project-thumbnails/tabs.png"
                link="https://aidanch1.github.io/TABS/"
                name="TABS"
                description={['"Totally accurate brain simulator", a small project made with a friend which lets you make simple neuron circuits, then animates what would happen. It uses ',
                <a className="whitelink" href="https://graphviz.org/" target="_blank" rel="noreferrer">graphviz</a>,
                " and bootstrap."]}
            />
        </div>
    )
}

export default htmlcssSection