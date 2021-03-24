import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function ReactSection(){
    return (
        <div className="column d-flex flex-column">
            <Skill
                title="React"
                description={["I've recently learned ",
                <a href="https://reactjs.org/" target="_blank">React</a>, 
                " to improve my front end skills. I'm a beginner, but know the basics."]}
                color="deepskyblue"
            />
            <Project 
                image="/apple-touch-icon.png"
                link=""
                name="Personal Website"
                description="This website is built with React!. Some bits are a bit scuffed but I think its fine overall. I'll definitely add to it in the future."
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
                description="I have minimal experience with android studio and python."
            />
        </div>
    )
}

export default ReactSection