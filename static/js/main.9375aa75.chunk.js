(this.webpackJsonppersonalwebsite=this.webpackJsonppersonalwebsite||[]).push([[0],{159:function(e,t,n){var a={"./first-internship.md":[161,3],"./hello-world.md":[162,4],"./how-to-get-into-uw-cs.md":[163,5]};function i(e){if(!n.o(a,e))return Promise.resolve().then((function(){var t=new Error("Cannot find module '"+e+"'");throw t.code="MODULE_NOT_FOUND",t}));var t=a[e],i=t[0];return n.e(t[1]).then((function(){return n(i)}))}i.keys=function(){return Object.keys(a)},i.id=159,e.exports=i},160:function(e,t,n){"use strict";n.r(t);var a=n(0),i=n.n(a),s=n(26),r=n.n(s),o=n(13),c=(n(72),n(73),n(74),n(18)),l=n(19),d=n(22),h=n(21),u=n(1);var m=function(e){return Object(u.jsx)("a",{className:"mx-2",href:e.link,target:"_blank",rel:"noreferrer",children:Object(u.jsx)("img",{src:e.logo,width:"32px",height:"32px",alt:""})})};var j=function(){return Object(u.jsxs)("div",{className:"d-flex justify-content-center mb-4",children:[Object(u.jsx)(m,{link:"https://github.com/aidanch1",logo:"/GitHub-Mark-Light-32px.png"}),Object(u.jsx)(m,{link:"mailto:aidanchen@gmail.com",logo:"/EmailLogo.png"}),Object(u.jsx)(m,{link:"https://www.linkedin.com/in/aidan-chen-0844861b0",logo:"/linkedin.png"})]})},p=n(36),b=n(37);var g=function(e){return Object(u.jsxs)(p.a,{className:e.hide?" hidden":"",expand:"md",variant:"dark",children:[Object(u.jsx)(p.a.Toggle,{"aria-controls":"navlinks"}),Object(u.jsxs)(p.a.Collapse,{id:"navlinks",children:[Object(u.jsx)(b.a.Link,{exact:!0,as:o.c,to:"/",children:"Portfolio"}),Object(u.jsx)(b.a.Link,{exact:!0,as:o.c,to:"/about",children:"About"}),Object(u.jsx)(b.a.Link,{exact:!0,as:o.c,to:"/blog",children:"Blog"})]})]})};var x=function(e){return Object(u.jsxs)("div",{className:"column",children:[Object(u.jsx)("h3",{style:{color:e.color},children:e.title}),Object(u.jsx)("p",{children:e.description})]})},f=n(33),O=function(e){Object(d.a)(n,e);var t=Object(h.a)(n);function n(){var e;return Object(c.a)(this,n),(e=t.call(this)).state={activated:!1,showbody:!1},e.handleClick=e.handleClick.bind(Object(f.a)(e)),e}return Object(l.a)(n,[{key:"handleClick",value:function(){this.setState((function(e){return{activated:!e.activated}})),this.state.activated?this.setState({showbody:!1}):setTimeout(function(){this.setState({showbody:this.state.activated})}.bind(this),500)}},{key:"render",value:function(){return Object(u.jsx)("button",{className:"project my-4"+(this.state.activated?" activated":""),style:{backgroundImage:"url( ".concat(this.props.image," )")},onClick:this.handleClick,children:this.state.showbody?Object(u.jsxs)("div",{children:[this.props.link?Object(u.jsxs)("a",{href:this.props.link,target:"_blank",rel:"noreferrer",className:"whitelink",children:[this.props.name,"\u2197"]}):Object(u.jsx)("p",{className:"mb-0",children:this.props.name}),Object(u.jsx)("p",{className:"mt-1",children:this.props.description})]}):this.props.name})}}]),n}(i.a.Component);var v=function(){return Object(u.jsxs)("div",{className:"d-flex flex-row justify-content-start w-50",children:[Object(u.jsx)(x,{title:"Java",description:"I'm the most comfortable with java, have gotten familiar with its libraries over the past 3 years",color:"darkorange"}),Object(u.jsx)(O,{image:"/project-thumbnails/campuspaths.png",link:"https://campuspaths-website.herokuapp.com/",name:"Campus Paths",description:"A web app which uses Dijkstra's and then draws the shortest path between 2 buildings at the UW. \r Implemented the backend using a Spark Java server and the front end with React"}),Object(u.jsx)(O,{image:"/project-thumbnails/mazegenerator.png",link:"/mazeapp.jar",name:"Maze Generator",description:"An app which generates a solveable maze using Kruskals algorithm to ensure start and end are connected, using randomized weights between rooms to create a random looking maze. \r Can also solve the maze using dijkstra's algorithm"}),Object(u.jsx)(O,{image:"/project-thumbnails/usaco.png",link:"https://drive.google.com/drive/folders/1nVCAhWkO-BFG1f823Mz15sWvTBqKj1A1?usp=sharing",name:"USACO",description:"Solve complex programming problems in Java with time and space constraints, using knowledge of data structures, algorithms, and math. \r I'm in the gold division"})]})};var k=function(){return Object(u.jsxs)("div",{className:"d-flex flex-row justify-content-start w-50",children:[Object(u.jsx)(x,{title:"Node.JS",description:"I've made some multiplayer browser games using Express and SocketIO. Also made a discord bot",color:"forestgreen"}),Object(u.jsx)(O,{image:"/project-thumbnails/rubiksrace.png",link:"https://github.com/aidanch1/rubiksrace",name:"Rubiks Race",description:"An online version of Rubiks Race, a sliding puzzle where 2 players race to be the first to make a design. \r Implemented the randomization algorithm and game logic"}),Object(u.jsx)(O,{image:"/project-thumbnails/diepioripoff.png",link:"https://github.com/aidanch1/diepioripoff",name:"Multiplayer Tank Game",description:"A .io style game where you play against others for the #1 spot on the leaderboards. \r Implemented scrolling movement, shooting, collision logic, and random reward generation on the map"}),Object(u.jsx)(O,{image:"/project-thumbnails/St._JerryPFP.png",link:"https://github.com/aidanch1/Big-Brain-Jerry-discord-bot-",name:"Price Checker",description:["Discord bot for Hypixel Skyblock that fetches auction and bazaar price data from Hypixel's public ",Object(u.jsx)("a",{className:"whitelink",href:"https://api.hypixel.net/",target:"_blank",rel:"noreferrer",children:"api"})," for items the user is interested in buying. Uses a fuzzyset to make it easier to use."]})]})};var w=function(){return Object(u.jsxs)("div",{className:"d-flex flex-row justify-content-start w-50",children:[Object(u.jsx)(x,{title:"HTML/CSS/JS",description:"I've worked on the front end in 2 team projects and have a basic understanding of html and css",color:"gold"}),Object(u.jsx)(O,{image:"/project-thumbnails/sudoku.png",link:"https://github.com/jamesm62/sudokusolver",name:"Sudoku Master",description:"A web app I made with a couple friends which solves and generates sudoku puzzles. \r I created the front end, allowing intuitive use and displaying information from the API endpoints. Follow the readme if you wanna use it!"}),Object(u.jsx)(O,{image:"/project-thumbnails/tabs.png",link:"https://aidanch1.github.io/TABS/",name:"TABS",description:['"Totally accurate brain simulator", a small project made with a friend which lets you make simple neuron circuits, then animates what would happen. It uses ',Object(u.jsx)("a",{className:"whitelink",href:"https://graphviz.org/",target:"_blank",rel:"noreferrer",children:"graphviz"})," and bootstrap."]})]})};var y=function(){return Object(u.jsxs)("div",{className:"d-flex flex-row justify-content-start w-50",children:[Object(u.jsx)(x,{title:"React",description:"I've used react for the front end of multiple projects",color:"deepskyblue"}),Object(u.jsx)(O,{image:"/apple-touch-icon.png",link:"https://github.com/aidanch1/aidanch1.github.io",name:"Personal Website",description:"This website is built with React! Some bits are a bit scuffed but I think its fine overall. I'll definitely add to it in the future."}),Object(u.jsx)(O,{image:"/project-thumbnails/memegenerator.png",link:"https://aidanch1.github.io/meme-generator",name:"Meme Generator",description:"It fetches a list of iconic meme images from an api and lets the user type top and bottom text to make their own meme. \r Its not styled very well; I didn't put much effort into the CSS."})]})};var N=function(){return Object(u.jsxs)("div",{className:"d-flex flex-row justify-content-start w-50",children:[Object(u.jsx)(x,{title:"Python",description:"I'm planning on building some bigger projects soon.",color:"#3474a5"}),Object(u.jsx)(O,{image:"/project-thumbnails/numpy.png",name:"Classwork",description:"Learned and implemented probabilistic data strucutures such as Bayseian filters, Bloom filters, and distinct element estimation.\r Learned how to use simulations to solve the knapsack and multi-armed bandits problem"}),Object(u.jsx)(O,{image:"/project-thumbnails/LeetCode_logo_black.png",link:"https://leetcode.com/aidanch1/",name:"LeetCode",description:"Competed in 14 coding contests, achieving a rating of 1913 (top 3%) and Knight Badge."})]})};var C=function(){return Object(u.jsxs)("div",{className:"d-flex flex-row justify-content-start w-50",children:[Object(u.jsx)(x,{title:"C",description:"I've gained experience in C and C++ through projects in class. Taken CSE 351 and I'm taking CSE 333 next quarter",color:"#00589d"}),Object(u.jsx)(O,{image:"/project-thumbnails/freeblock.png",name:"Dynamic Memory Allocator",description:"Implemented a memory allocator using an explicit free list, supporting malloc and free functionality. \r Achieved on average 84% space utilization and matched the speed of the malloc library"})]})};var S=function(){return Object(u.jsxs)("div",{children:[Object(u.jsx)("h3",{className:"text-center mb-5",children:"Computer science student at the University of Washington"}),Object(u.jsxs)("div",{className:"d-flex flex-column align-items-center",children:[Object(u.jsx)(v,{}),Object(u.jsx)(k,{}),Object(u.jsx)(w,{}),Object(u.jsx)(C,{}),Object(u.jsx)(y,{}),Object(u.jsx)(N,{})]})]})},I=function(e){Object(d.a)(n,e);var t=Object(h.a)(n);function n(){var e;return Object(c.a)(this,n),(e=t.call(this)).state={age:0},e}return Object(l.a)(n,[{key:"componentDidMount",value:function(){var e=this;setInterval((function(){var t=(new Date-new Date("2004/01/30"))/315576e5;e.setState({time:t.toString().substring(0,12)})}),50)}},{key:"render",value:function(){return Object(u.jsx)("span",{children:this.state.time})}}]),n}(i.a.Component);var A=function(){return Object(u.jsx)("div",{className:"about container",children:Object(u.jsxs)("div",{className:"aboutrow row",children:[Object(u.jsx)("div",{className:"col-md-auto",children:Object(u.jsx)("img",{className:"aboutSelfPicture",src:"/self-picture-300x291px.png",alt:""})}),Object(u.jsxs)("div",{className:"col",children:[Object(u.jsxs)("h3",{children:["Name: Aidan Chen ",Object(u.jsx)("br",{}),"Year: Sophomore ",Object(u.jsx)("br",{}),"Age: ",Object(u.jsx)(I,{})," years"]}),Object(u.jsxs)("h4",{children:["Hobbies:",Object(u.jsxs)("ul",{children:[Object(u.jsxs)("li",{children:["Chess (Add me!)",Object(u.jsx)(m,{link:"https://www.chess.com/member/potatershshh",logo:"/chess.com-Logo.png"}),Object(u.jsx)(m,{link:"https://lichess.org/@/POtatershshh",logo:"/lichess-Logo.png"})]}),Object(u.jsx)("li",{children:"Playing games (currently genshin, bedwars). Also party games with friends"}),Object(u.jsx)("li",{children:"Watching anime, my favorite shows are Your Lie in April and Steins;Gate"}),Object(u.jsx)("li",{children:"Doing stuff with my friends like swimming, biking, or shooting hoops"})]})]})]})]})})},z=n(84);var D=function(){var e=z.map((function(e){return Object(u.jsx)(o.b,{to:"/post/"+e.slug,className:"post-link",children:Object(u.jsxs)("div",{className:"row justify-content-between",children:[Object(u.jsxs)("div",{className:"col-10",children:[Object(u.jsx)("h5",{children:e.title}),Object(u.jsx)("p",{children:e.date})]}),Object(u.jsx)("h1",{className:"col-2",children:"\u276f"})]})},e.slug)}));return Object(u.jsx)("div",{className:"container d-flex flex-column",children:e})},L=n(51),M=n.n(L),P=n(66),J=n(67),T=n.n(J),B=function(e){Object(d.a)(a,e);var t=Object(h.a)(a);function a(){var e;return Object(c.a)(this,a),(e=t.call(this)).state={md:""},e}return Object(l.a)(a,[{key:"componentDidMount",value:function(){var e=Object(P.a)(M.a.mark((function e(){var t,a,i,s;return M.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return t=this.props.match.params.slug,e.next=3,n(159)("./".concat(t,".md"));case 3:return a=e.sent,e.next=6,fetch(a.default);case 6:return i=e.sent,e.next=9,i.text();case 9:s=e.sent,this.setState({md:s});case 11:case"end":return e.stop()}}),e,this)})));return function(){return e.apply(this,arguments)}}()},{key:"render",value:function(){return Object(u.jsx)("div",{className:"post container",children:Object(u.jsx)(T.a,{children:this.state.md})})}}]),a}(i.a.Component);var _=function(){return Object(u.jsx)("h1",{className:"text-center",children:"Page does not exist \xaf\\_(\u30c4)_/\xaf"})},H=n(4);var W=function(){return Object(u.jsxs)(H.c,{children:[Object(u.jsx)(H.a,{exact:!0,path:"/",component:S}),Object(u.jsx)(H.a,{exact:!0,path:"/about",component:A}),Object(u.jsx)(H.a,{exact:!0,path:"/blog",component:D}),Object(u.jsx)(H.a,{path:"/post/:slug",component:B}),Object(u.jsx)(H.a,{component:_})]})},E="aidanch1",R=function(e){Object(d.a)(n,e);var t=Object(h.a)(n);function n(){var e;return Object(c.a)(this,n),(e=t.call(this)).state={header:"",introNotDone:!0},e}return Object(l.a)(n,[{key:"updateHeader",value:function(e){if(e<=E.length){this.setState({header:E.substring(0,e)});var t=e===E.length-1?300:100;setTimeout(this.updateHeader.bind(this,e+1),t)}else this.setState({introNotDone:!1})}},{key:"componentDidMount",value:function(){this.updateHeader(0)}},{key:"render",value:function(){return Object(u.jsxs)("main",{children:[Object(u.jsx)("h1",{className:"intro text-center"+(this.state.introNotDone?"":" top"),children:this.state.header}),Object(u.jsx)(g,{hide:this.state.introNotDone}),Object(u.jsxs)("div",{className:"main-area"+(this.state.introNotDone?" hidden":""),children:[Object(u.jsx)(j,{}),Object(u.jsx)(W,{})]})]})}}]),n}(i.a.Component);r.a.render(Object(u.jsx)(o.a,{children:Object(u.jsx)(R,{})}),document.getElementById("root"))},73:function(e,t,n){},74:function(e,t,n){},84:function(e){e.exports=JSON.parse('[{"title":"First internship!","date":"January 20, 2022","slug":"first-internship"},{"title":"How to get into UW CS","date":"July 29, 2021","slug":"how-to-get-into-uw-cs"},{"title":"Hello World","date":"March 26, 2021","slug":"hello-world"}]')}},[[160,1,2]]]);
//# sourceMappingURL=main.9375aa75.chunk.js.map