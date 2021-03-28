import React from "react"
import { useMediaQuery } from "react-responsive"
import JavaSection from "./JavaSection"
import NodejsSection from "./NodejsSection"
import HtmlSection from "./HtmlSection"
import ReactSection from "./ReactSection"

function Portfolio() {
    const isTabletOrMobile = useMediaQuery({ query: '(max-width: 1224px)' })
    const notPhone = useMediaQuery({ query: '(min-width: 768px)' })
    const isTablet = isTabletOrMobile && notPhone;
    return (
        <div>
            <h3 className="text-center mb-5">
                I'm a 17 year old freshman at the University of Washington.<br />
                I like coding and this is stuff I've made and learned.
            </h3>
            <div className={"d-flex " + (isTabletOrMobile ? "flex-column align-items-center" : "justify-content-around")}>
                <JavaSection isTablet={isTablet}/>
                <NodejsSection isTablet={isTablet}/>
                <HtmlSection isTablet={isTablet}/>
                <ReactSection isTablet={isTablet}/>
            </div>
        </div>
        
    )
}

export default Portfolio
