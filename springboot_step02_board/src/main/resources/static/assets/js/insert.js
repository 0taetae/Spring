const form = document.querySelector("#form");
const wtInput = document.querySelector("#writer");
const pwInput = document.querySelector("#pwd");
const ttInput = document.querySelector("#title");
const ctInput = document.querySelector("#content");

const pathname = "/" + window.location.pathname.split("/")[1];
const origin = window.location.origin;
const contextPath = origin + pathname;


const submitBtn = document.querySelector("#subBtn");
submitBtn.addEventListener("click", function(){
	const info = {
		"writer" : wtInput.value, 
		"title" : ttInput.value, 
		"content" : ctInput.value,
		"pwd" : pwInput.value
	}
	console.log("info ", info);
	for(i in info){
		console.log(i+"="+info[i]);
		if(info[i] == null || info[i] == '' || info[i] == undefined){
			alert("모든 항목을 입력해주세요.");
			return;
		}
	}
	
	fetch("./post", {
		body: JSON.stringify(info),
		headers: {
		      'Content-Type': 'application/json;charset=utf-8'
		    },
		method : "post"
	})
	.then((res)=> res.text())
	.then(data=> ifSuccess()	)
	.catch(() => ifFail() );
});

function ifSuccess(){
	location.href = `${contextPath}/list`;
}

function ifFail(){
	alert("실패했습니다. 다시 시도해주세요.")
}

