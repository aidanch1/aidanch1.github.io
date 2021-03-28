import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function JavaSection(){
    return (
        <div className="column d-flex flex-column">
            <Skill
                title="Java"
                description="By far my most comfortable language. I have about 3 years of experience and wrote the most code 
                (usually solving programming problems) in it."
                color="darkorange"
            />
            <Project 
                image="/project-thumbnails/usaco.png"
                
                name="USACO"
                description="I've probably invested about 100 hours into USACO. (I'm in the gold division, but the skill inflation is outrageous)
                I'm familiar with basic concepts like sorting, DP, shortest paths, flood fill, dfs/bfs, etc. and finding tricks to cut down the runtime."
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