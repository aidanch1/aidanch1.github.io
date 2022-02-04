import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function JavaSection(){
    return (
        <div className={"d-flex flex-row justify-content-start w-50"}>
            <Skill
                title="Java"
                description="I have about 3 years of experience and wrote the most code in it."
                color="darkorange"
            />
            <Project 
                image="/project-thumbnails/usaco.png"
                link="https://drive.google.com/drive/folders/1nVCAhWkO-BFG1f823Mz15sWvTBqKj1A1?usp=sharing"
                name="USACO"
                description="I'm in the gold division, so basic knowledge of data structures and algorithms"
            />
            <Project 
                image="/apple-touch-icon.png"
                name="Other stuff"
                description={["I like automating mundane tasks with java's robot class. Some libraries which I've used are ",
                <a className="whitelink" href="https://github.com/kristian/system-hook" target="_blank" rel="noreferrer">system hook</a>," and ",
                <a className="whitelink" href="https://opencv.org/" target="_blank" rel="noreferrer">OpenCV</a>, 
                ". These are mostly short scripts to get free resources/beat challenges in games."]}
            />
        </div>
    )
}

export default JavaSection