(this.webpackJsonppersonalwebsite=this.webpackJsonppersonalwebsite||[]).push([[0],{160:function(e,t,n){var s={"./hello-world.md":[162,3]};function i(e){if(!n.o(s,e))return Promise.resolve().then((function(){var t=new Error("Cannot find module '"+e+"'");throw t.code="MODULE_NOT_FOUND",t}));var t=s[e],i=t[0];return n.e(t[1]).then((function(){return n(i)}))}i.keys=function(){return Object.keys(s)},i.id=160,e.exports=i},161:function(e,t,n){"use strict";n.r(t);var s=n(0),i=n.n(s),a=n(26),r=n.n(a),c=n(13),o=(n(73),n(74),n(75),n(22)),l=n(23),h=n(25),d=n(24),b=n(1);var u=function(e){return Object(b.jsx)("a",{className:"mx-2",href:e.link,target:"_blank",rel:"noreferrer",children:Object(b.jsx)("img",{src:e.logo,width:"32px",height:"32px",alt:""})})};var j=function(){return Object(b.jsxs)("div",{className:"d-flex justify-content-center mb-4",children:[Object(b.jsx)(u,{link:"https://github.com/aidanch1",logo:"/GitHub-Mark-Light-32px.png"}),Object(b.jsx)(u,{link:"mailto:aidanchen@gmail.com",logo:"/EmailLogo.png"}),Object(b.jsx)(u,{link:"https://www.linkedin.com/in/aidan-chen-0844861b0",logo:"/linkedin.png"})]})},m=n(36),p=n(37);var x=function(e){return Object(b.jsxs)(m.a,{className:e.hide?" hidden":"",expand:"md",variant:"dark",children:[Object(b.jsx)(m.a.Toggle,{"aria-controls":"navlinks"}),Object(b.jsxs)(m.a.Collapse,{id:"navlinks",children:[Object(b.jsx)(p.a.Link,{exact:!0,as:c.c,to:"/",children:"Portfolio"}),Object(b.jsx)(p.a.Link,{exact:!0,as:c.c,to:"/about",children:"About"}),Object(b.jsx)(p.a.Link,{exact:!0,as:c.c,to:"/blog",children:"Blog"})]})]})},f=n(51);var g=function(e){return Object(b.jsxs)("div",{className:e.isTablet?"column":"",children:[Object(b.jsx)("h3",{style:{color:e.color},children:e.title}),Object(b.jsx)("p",{children:e.description})]})},O=n(33),k=function(e){Object(h.a)(n,e);var t=Object(d.a)(n);function n(){var e;return Object(o.a)(this,n),(e=t.call(this)).state={activated:!1,showbody:!1},e.handleClick=e.handleClick.bind(Object(O.a)(e)),e}return Object(l.a)(n,[{key:"handleClick",value:function(){this.setState((function(e){return{activated:!e.activated}})),this.state.activated?this.setState({showbody:!1}):setTimeout(function(){this.setState({showbody:this.state.activated})}.bind(this),500)}},{key:"render",value:function(){return Object(b.jsx)("button",{className:"project my-4"+(this.state.activated?" activated":""),style:{backgroundImage:"url( ".concat(this.props.image," )")},onClick:this.handleClick,children:this.state.showbody?Object(b.jsxs)("div",{children:[this.props.link?Object(b.jsxs)("a",{href:this.props.link,target:"_blank",rel:"noreferrer",className:"whitelink",children:[this.props.name,"\u2197"]}):Object(b.jsx)("p",{className:"mb-0",children:this.props.name}),Object(b.jsx)("p",{className:"mt-1",children:this.props.description})]}):this.props.name})}}]),n}(i.a.Component);var v=function(e){return Object(b.jsxs)("div",{className:e.isTablet?"d-flex flex-row":"column d-flex flex-column",children:[Object(b.jsx)(g,{title:"Java",description:"By far my most comfortable language. I have about 3 years of experience and wrote the most code \r (usually solving programming problems) in it.",color:"darkorange",isTablet:e.isTablet}),Object(b.jsx)(k,{image:"/project-thumbnails/usaco.png",link:"https://drive.google.com/drive/folders/1nVCAhWkO-BFG1f823Mz15sWvTBqKj1A1?usp=sharing",name:"USACO",description:"I've probably invested about 100 hours into USACO. (I'm in the gold division, but the skill inflation is outrageous)\r I'm familiar with basic concepts like sorting, DP, shortest paths, flood fill, dfs/bfs, etc. and finding tricks to cut down the runtime."}),Object(b.jsx)(k,{image:"/project-thumbnails/LeetCode_logo_black.png",link:"https://leetcode.com/aidanch1/",name:"LeetCode",description:["Recently gotten into it. Trying to get contest rating over 2100 (currently rated 1790, I've only done 5 contests). Problems solved: 124 Link to my profile is above and link to my yt channel is here: ",Object(b.jsx)("a",{className:"whitelink",href:"https://www.youtube.com/channel/UCbkEY_Q_cjApuCHYcgdpM3g",target:"_blank",rel:"noreferrer",children:"yt channel"})]}),Object(b.jsx)(k,{image:"/apple-touch-icon.png",name:"Other stuff",description:["I like automating mundane tasks with java's robot class. Some libraries which I've used are ",Object(b.jsx)("a",{className:"whitelink",href:"https://github.com/kristian/system-hook",target:"_blank",rel:"noreferrer",children:"system hook"})," and ",Object(b.jsx)("a",{className:"whitelink",href:"https://opencv.org/",target:"_blank",rel:"noreferrer",children:"OpenCV"}),". These are mostly short scripts to get free resources/beat challenges in games."]})]})};var y=function(e){return Object(b.jsxs)("div",{className:e.isTablet?"d-flex flex-row":"column d-flex flex-column",children:[Object(b.jsx)(g,{title:"Node.JS",description:[Object(b.jsx)("span",{children:"I've made some multiplayer browser games using "},"1"),Object(b.jsx)("a",{href:"https://socket.io/docs/v3",target:"_blank",rel:"noreferrer",className:"whitelink",children:"Socket.IO"},"2"),Object(b.jsx)("span",{children:" and made a couple discord bots. I'm intermediate but by no means an expert."},"3")],color:"forestgreen",isTablet:e.isTablet}),Object(b.jsx)(k,{image:"/project-thumbnails/rubiksrace.png",link:"https://github.com/aidanch1/rubiksrace",name:"Rubiks Race",description:"An online version of Rubiks Race, a sliding puzzle where 2 players race to be the first to make a design."}),Object(b.jsx)(k,{image:"/project-thumbnails/diepioripoff.png",link:"https://github.com/aidanch1/diepioripoff",name:"Multiplayer Tank Game",description:"A .io style game where you play against others for the #1 spot on the leaderboards."}),Object(b.jsx)(k,{image:"/project-thumbnails/St._JerryPFP.png",link:"https://github.com/aidanch1/Big-Brain-Jerry-discord-bot-",name:"Price Checker",description:["Discord bot for Hypixel Skyblock that fetches auction and bazaar price data from Hypixel's public ",Object(b.jsx)("a",{className:"whitelink",href:"https://api.hypixel.net/",target:"_blank",rel:"noreferrer",children:"api"})," for items the user is interested in buying. Uses a fuzzyset to make it easier to use."]})]})};var w=function(e){return Object(b.jsxs)("div",{className:e.isTablet?"d-flex flex-row":"column d-flex flex-column",children:[Object(b.jsx)(g,{title:"HTML/CSS/JS",description:"Anything which opens in the browser has included some html, css, or javascript. \r I never formally learned; just googled stuff.",color:"gold",isTablet:e.isTablet}),Object(b.jsx)(k,{image:"/project-thumbnails/sudoku.png",link:"https://github.com/jamesm62/sudokusolver",name:"Sudoku Master",description:"A web app I made with a couple friends which solves and generates sudoku puzzles. I worked on the front end. Follow the readme if you wanna use it!"}),Object(b.jsx)(k,{image:"/project-thumbnails/tabs.png",link:"https://aidanch1.github.io/TABS/",name:"TABS",description:['"Totally accurate brain simulator", a small project made with a friend which lets you make simple neuron circuits, then animates what would happen. It uses ',Object(b.jsx)("a",{className:"whitelink",href:"https://graphviz.org/",target:"_blank",rel:"noreferrer",children:"graphviz"})," and bootstrap."]}),Object(b.jsx)(k,{image:"/project-thumbnails/soundboard.jpg",link:"https://github.com/aidanch1/soundboard-template-HTML5",name:"Soundboard",description:"A template that makes it super easy to make a soundboard!"})]})};var N=function(e){return Object(b.jsxs)("div",{className:e.isTablet?"d-flex flex-row":"column d-flex flex-column",children:[Object(b.jsx)(g,{title:"React",description:[Object(b.jsx)("span",{children:"I've recently learned "},"1"),Object(b.jsx)("a",{href:"https://reactjs.org/",target:"_blank",rel:"noreferrer",className:"whitelink",children:"React"},"2"),Object(b.jsx)("span",{children:" to improve my front end skills. I'm a beginner, but know the basics."},"3")],color:"deepskyblue",isTablet:e.isTablet}),Object(b.jsx)(k,{image:"/apple-touch-icon.png",link:"https://github.com/aidanch1/aidanch1.github.io",name:"Personal Website",description:"This website is built with React! Some bits are a bit scuffed but I think its fine overall. I'll definitely add to it in the future."}),Object(b.jsx)(k,{image:"/project-thumbnails/memegenerator.png",link:"https://aidanch1.github.io/meme-generator",name:"Meme Generator",description:"It fetches a list of iconic meme images from an api and lets the user type top and bottom text to make their own meme. \r Its not styled very well; I didn't put much effort into the CSS."}),Object(b.jsx)(k,{image:"",name:"Misc.",description:"Some other skills that aren't worth mentioning in a stand alone bubble: I'm familiar with git, use eclipse and vscode, \r and have some experience with android studio and python."})]})};var I=function(){var e=Object(f.useMediaQuery)({query:"(max-width: 1224px)"}),t=Object(f.useMediaQuery)({query:"(min-width: 768px)"}),n=e&&t;return Object(b.jsxs)("div",{children:[Object(b.jsxs)("h3",{className:"text-center mb-5",children:["I'm a 17 year old freshman at the University of Washington.",Object(b.jsx)("br",{}),"I like coding and this is stuff I've made and learned."]}),Object(b.jsxs)("div",{className:"d-flex "+(e?"flex-column align-items-center":"justify-content-around"),children:[Object(b.jsx)(v,{isTablet:n}),Object(b.jsx)(y,{isTablet:n}),Object(b.jsx)(w,{isTablet:n}),Object(b.jsx)(N,{isTablet:n})]})]})};var T=function(){return Object(b.jsx)("div",{className:"about container",children:Object(b.jsxs)("div",{className:"aboutrow row",children:[Object(b.jsx)("div",{className:"col-md-auto",children:Object(b.jsx)("img",{className:"aboutSelfPicture",src:"/self-picture-300x291px.png",alt:""})}),Object(b.jsxs)("div",{className:"col",children:[Object(b.jsxs)("h3",{children:["Hi!",Object(b.jsx)("br",{}),"My name is Aidan Chen. Right now I'm a freshman at the University of Washington.",Object(b.jsx)("br",{}),"I'm not in a major yet but I hope to get into CS.",Object(b.jsx)("br",{})]}),Object(b.jsxs)("h4",{children:["Hobbies:",Object(b.jsxs)("ul",{children:[Object(b.jsxs)("li",{children:["Chess. Add me!",Object(b.jsx)(u,{link:"https://www.chess.com/member/potatershshh",logo:"/chess.com-Logo.png"}),Object(b.jsx)(u,{link:"https://lichess.org/@/POtatershshh",logo:"/lichess-Logo.png"})]}),Object(b.jsx)("li",{children:"Coding. (wow shocker!)"}),Object(b.jsx)("li",{children:"Playing games. I like minecraft and league. Also big fan of board/card games."}),Object(b.jsx)("li",{children:"Doing stuff with my friends like swimming, biking, or shooting hoops."})]})]})]})]})})},S=n(85);var C=function(){var e=S.map((function(e){return Object(b.jsx)(c.b,{to:"/post/"+e.slug,className:"post-link",children:Object(b.jsxs)("div",{className:"row justify-content-between",children:[Object(b.jsxs)("div",{className:"col-10",children:[Object(b.jsx)("h5",{children:e.title}),Object(b.jsx)("p",{children:e.date})]}),Object(b.jsx)("h1",{className:"col-2",children:"\u276f"})]})},e.slug)}));return Object(b.jsx)("div",{className:"container d-flex flex-column",children:e})},_=n(52),A=n.n(_),M=n(67),L=n(68),D=n.n(L),H=function(e){Object(h.a)(s,e);var t=Object(d.a)(s);function s(){var e;return Object(o.a)(this,s),(e=t.call(this)).state={md:""},e}return Object(l.a)(s,[{key:"componentDidMount",value:function(){var e=Object(M.a)(A.a.mark((function e(){var t,s,i,a;return A.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return t=this.props.match.params.slug,e.next=3,n(160)("./".concat(t,".md"));case 3:return s=e.sent,e.next=6,fetch(s.default);case 6:return i=e.sent,e.next=9,i.text();case 9:a=e.sent,this.setState({md:a});case 11:case"end":return e.stop()}}),e,this)})));return function(){return e.apply(this,arguments)}}()},{key:"render",value:function(){return Object(b.jsx)("div",{className:"post container",children:Object(b.jsx)(D.a,{children:this.state.md})})}}]),s}(i.a.Component);var P=function(){return Object(b.jsx)("h1",{className:"text-center",children:"Page does not exist \xaf\\_(\u30c4)_/\xaf"})},z=n(4);var B=function(){return Object(b.jsxs)(z.c,{children:[Object(b.jsx)(z.a,{exact:!0,path:"/",component:I}),Object(b.jsx)(z.a,{exact:!0,path:"/about",component:T}),Object(b.jsx)(z.a,{exact:!0,path:"/blog",component:C}),Object(b.jsx)(z.a,{path:"/post/:slug",component:H}),Object(b.jsx)(z.a,{component:P})]})},R="aidanch1",J=function(e){Object(h.a)(n,e);var t=Object(d.a)(n);function n(){var e;return Object(o.a)(this,n),(e=t.call(this)).state={header:"",introNotDone:!0},e}return Object(l.a)(n,[{key:"updateHeader",value:function(e){if(e<=R.length){this.setState({header:R.substring(0,e)});var t=e===R.length-1?350:100;setTimeout(this.updateHeader.bind(this,e+1),t)}else this.setState({introNotDone:!1})}},{key:"componentDidMount",value:function(){this.updateHeader(0)}},{key:"render",value:function(){return Object(b.jsxs)("main",{children:[Object(b.jsx)("h1",{className:"intro text-center"+(this.state.introNotDone?"":" top"),children:this.state.header}),Object(b.jsx)(x,{hide:this.state.introNotDone}),Object(b.jsxs)("div",{className:"main-area"+(this.state.introNotDone?" hidden":""),children:[Object(b.jsx)(j,{}),Object(b.jsx)(B,{})]})]})}}]),n}(i.a.Component);r.a.render(Object(b.jsx)(c.a,{children:Object(b.jsx)(J,{})}),document.getElementById("root"))},74:function(e,t,n){},75:function(e,t,n){},85:function(e){e.exports=JSON.parse('[{"title":"Hello World","date":"March 26, 2021","slug":"hello-world"}]')}},[[161,1,2]]]);
//# sourceMappingURL=main.89f887e1.chunk.js.map