import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function ReactSection(){
    return (
        <div className={"d-flex flex-row justify-content-start"}>
            <Skill
                title="React"
                description="I've used react for the front end of multiple projects, though most aren't good enough to show"
                color="deepskyblue"
            />
            <Project 
                image="/apple-touch-icon.png"
                link="https://github.com/aidanch1/aidanch1.github.io"
                name="Personal Website"
                description="This website is built with React! Some bits are a bit scuffed but I think its fine overall. I'll definitely add to it in the future."
            />
        </div>
    )
}

export default ReactSection