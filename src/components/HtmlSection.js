import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function htmlcssSection(){
    return (
        <div className={"d-flex flex-row justify-content-start w-50"}>
            <Skill
                title="HTML/CSS/JS"
                description="Anything which opens in the browser has included some html, css, or javascript. 
                I never formally learned; just googled stuff."
                color="gold"
            />
            <Project 
                image="/project-thumbnails/sudoku.png"
                link="https://github.com/jamesm62/sudokusolver"
                name="Sudoku Master"
                description="A web app I made with a couple friends which solves and generates sudoku puzzles. I worked on the front end. Follow the readme if you wanna use it!"
            />
            <Project 
                image="/project-thumbnails/tabs.png"
                link="https://aidanch1.github.io/TABS/"
                name="TABS"
                description={['"Totally accurate brain simulator", a small project made with a friend which lets you make simple neuron circuits, then animates what would happen. It uses ',
                <a className="whitelink" href="https://graphviz.org/" target="_blank" rel="noreferrer">graphviz</a>,
                " and bootstrap."]}
            />
            <Project 
                image="/project-thumbnails/soundboard.jpg"
                link="https://github.com/aidanch1/soundboard-template-HTML5"
                name="Soundboard"
                description="A template that makes it super easy to make a soundboard!"
            />
        </div>
    )
}

export default htmlcssSection