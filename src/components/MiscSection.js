import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function MiscSection(){
    return (
        <div className={"d-flex flex-row justify-content-start"}>
            <Skill
                title="Misc"
                description="I've dabbled in HTML/CSS, Azure, and Selenium, making a few small projects"
                color="gold"
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
            link="https://rpechuk.github.io/AdviserAssistant/"
            name="Advisor Assistant"
            description="Developed a chatbot which answers frequently asked questions to UW advisors. Imported 290 QnA pairs into the knowledge base and set up continuous deployment on Azure. The first question may take a while to boot up"
            />
            <Project
            link="https://github.com/aidanch1/uwclassregisterer"
            name="Class Registerer"
            description="Automated registering for UW classes with a Selenium script so I don’t need to wake up at 6am"
            />
        </div>
    )
}

export default MiscSection