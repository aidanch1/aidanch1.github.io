import React from "react"
import LogoLink from "./LogoLink"

function Socials(){
    return (
        <div className="d-flex justify-content-center mb-4">
            <LogoLink
                link="https://github.com/aidanch1"
                logo="/GitHub-Mark-Light-32px.png"
            />
            <LogoLink
                link="mailto:aidanchen@gmail.com"
                logo="/EmailLogo.png"
            />
            <LogoLink
                link="https://www.linkedin.com/in/aidan-chen-0844861b0"
                logo="/linkedin.png"
            />
        </div>
    )
}

export default Socials
