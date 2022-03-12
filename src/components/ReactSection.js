import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function ReactSection(){
    return (
        <div className={"d-flex flex-row justify-content-start w-50"}>
            <Skill
                title="React"
                description="I've used react for the front end of multiple projects"
                color="deepskyblue"
            />
            <Project 
                image="/apple-touch-icon.png"
                link="https://github.com/aidanch1/aidanch1.github.io"
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
        </div>
    )
}

export default ReactSection