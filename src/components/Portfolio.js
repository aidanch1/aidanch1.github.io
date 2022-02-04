import React from "react"
//import { useMediaQuery } from "react-responsive"
import JavaSection from "./JavaSection"
import NodejsSection from "./NodejsSection"
import HtmlSection from "./HtmlSection"
import ReactSection from "./ReactSection"
import PythonSection from "./PythonSection"
import CSection from "./CSection"

function Portfolio() {
    // const isTabletOrMobile = useMediaQuery({ query: '(max-width: 1224px)' })
    // const notPhone = useMediaQuery({ query: '(min-width: 768px)' })
    // const isTablet = isTabletOrMobile && notPhone;
    return (
        <div>
            <h3 className="text-center mb-5">
                I'm a 17 year old sophmore at the University of Washington.<br />
                I like coding ( •̀ ω •́ )✧
            </h3>
            <div className={"d-flex flex-column align-items-center"}>
                <JavaSection/>
                <NodejsSection/>
                <PythonSection/>
                <HtmlSection/>
                <ReactSection/>
                <CSection/>
            </div>
        </div>
        
    )
}

export default Portfolio
