import React from "react"
import Portfolio from "./Portfolio"
import About from "./About"
import Blog from "./Blog"
import Post from "./Post"
import PageNotFound from "./PageNotFound"
import { Switch, Route } from 'react-router-dom';

function Main(){
    return (
    <Switch>
        <Route exact path='/' component={Portfolio}></Route>
        <Route exact path='/about' component={About}></Route>
        <Route exact path='/blog' component={Blog}></Route>
        <Route path="/post/:slug" component={Post}></Route>
        <Route component={PageNotFound} />
    </Switch>
    )
}

export default Main