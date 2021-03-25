import React from "react"
import JavaSection from "./JavaSection"
import NodejsSection from "./NodejsSection"
import HtmlSection from "./HtmlSection"
import ReactSection from "./ReactSection"

function Portfolio() {
    return (
        <div>
            <h3 className="text-center mb-5">
                I'm a 17 year old freshman at the University of Washington.<br />
                I like coding and this is stuff I've made and learned.
            </h3>
            <div className="d-flex justify-content-around">
                <JavaSection />
                <NodejsSection />
                <HtmlSection />
                <ReactSection />
            </div>
        </div>
        
    )
}

export default Portfolio
