import React from "react"
//import { useMediaQuery } from "react-responsive"
import JavaSection from "./JavaSection"
import NodejsSection from "./NodejsSection"
import MiscSection from "./MiscSection"
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
                Computer science student at the University of Washington
            </h3>
            <div className="center">
                <div className={"d-flex flex-column"}>
                    <JavaSection/>
                    <NodejsSection/>
                    <CSection/>
                    <ReactSection/>
                    <MiscSection/>
                    <PythonSection/>
                </div>
            </div>
        </div>
        
    )
}

export default Portfolio
