import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function PythonSection(){
    return (
        <div className={"d-flex flex-row justify-content-start w-50"}>
            <Skill
                title="Python"
                description="When I have time I really want to build some bigger projects in python. I learned python in a class and now do all my LeetCode questions in python."
                color="#3474a5"
            />
            <Project 
                image="/apple-touch-icon.png"
                name="Classwork"
                description="In my class we used python to make probabilistic data structures and run simulations"
            />
            <Project 
                image="/project-thumbnails/LeetCode_logo_black.png"
                link="https://leetcode.com/aidanch1/"
                name="LeetCode"
                description="I do contests sometimes"
            />
        </div>
    )
}

export default PythonSection