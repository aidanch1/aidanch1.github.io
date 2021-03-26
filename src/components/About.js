import React from "react"
import LogoLink from "./LogoLink"

function About(){
    return (
        <div className="about container">
            <div className="aboutrow row align-items-center">
                <div className="col-md-auto">
                    <img src="/self-picture.png" width="300px" height="100%" alt=""></img>
                </div>
                <div className="col">
                    <h3>
                        Hi!<br />
                        My name is Aidan Chen. Right now I'm a freshman at the University of Washington.<br />
                        I'm not in a major yet but I hope to go into CS.<br />
                    </h3>
                    <h4>
                        Hobbies: 
                        <ul>
                            <li>Chess. Add me! 
                                <LogoLink link="https://www.chess.com/member/potatershshh"
                                logo="/chess.com-Logo.png"/>
                                <LogoLink link="https://lichess.org/@/POtatershshh"
                                logo="/lichess-Logo.png"/>
                            </li>
                            <li>Coding. (wow shocker!)</li>
                            <li>Playing games. (who doesn't?) I like minecraft and league. Also big fan of board/card games.</li>
                            <li>Doing stuff with my friends like swimming, biking, or shooting hoops.</li>
                        </ul>
                    </h4> 
                </div>
            </div>
        </div>
    )
}

export default About