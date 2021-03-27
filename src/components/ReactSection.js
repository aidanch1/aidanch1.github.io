import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function ReactSection(){
    return (
        <div className="column d-flex flex-column">
            <Skill
                title="React"
                description={[<span key="1">I've recently learned </span>,
                <a href="https://reactjs.org/" target="_blank" rel="noreferrer" key="2" className="whitelink">React</a>, 
                <span key="3"> to improve my front end skills. I'm a beginner, but know the basics.</span>]}
                color="deepskyblue"
            />
            <Project 
                image="/apple-touch-icon.png"
                link=""
                name="Personal Website"
                description="This website is built with React! Some bits are a bit scuffed but I think its fine overall. I'll definitely add to it in the future."
            />
            <Project 
                image="/project-thumbnails/memegenerator.png"
                link="https://aidanch1.github.io/meme-generator"
                name="Meme Generator"
                description="It fetches a list of iconic meme images from an api and lets the user type top and bottom text to make their own meme. 
                Its not styled very well; I didn't put much effort into the CSS."
            />
            <Project 
                image=""
                name="Misc."
                description="Some other skills that aren't worth mentioning in a stand alone bubble: I'm familiar with git, use eclipse and vscode, 
                and have some experience with android studio and python."
            />
        </div>
    )
}

export default ReactSection