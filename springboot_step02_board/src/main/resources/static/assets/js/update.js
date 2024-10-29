const pathname = "/" + window.location.pathname.split("/")[1];
const origin = window.location.origin;
const root = origin + pathname;
const uid = window.location.pathname.split("/")[3];
function delMod() {
	location.href = `${root}/list/${uid}`;
}

function modify() { // 글 삭제
	if (document.getElementById('pwd').value == '') {
		const msg = document.getElementById('pwmsg');
		msg.innerText ="비밀번호를 입력해주세요!";
		msg.style.color = "red";
		document.getElementById('pwd').focus();
		return;
	}
	const nmInput = document.querySelector("#num");
	const wtInput = document.querySelector("#writer");
	const pwInput = document.querySelector("#pwd");
	const ttInput = document.querySelector("#title");
	const ctInput = document.querySelector("#content");
	const info = {
		"num": nmInput.innerHTML,
		"writer": wtInput.innerHTML,
		"title": ttInput.value,
		"content": ctInput.value,
		"pwd": pwInput.value
	}
	console.log("info ", info);

	const modUrl = `${root}/post`;
	fetch(modUrl, {
		body: JSON.stringify(info),
		headers: {
			'Content-Type': 'application/json;charset=utf-8'
		},
		method: "put"
	})
	.then(res => {
		if(res.ok){
			ifSuccess();
		} else {
			ifFail();
		}
	})
}

function ifSuccess() {
	location.href = `${root}/list`;
}

function ifFail(){
	const msg = document.getElementById('pwmsg');
	msg.innerText ="비밀번호가 일치하지 않습니다.";
	msg.style.color = "red";
}


const boardEL = document.querySelector("#boardDiv");

const makeList = (data) => {
	console.log(data);
	pw = data.pwd;
	let html = `<table>
    <tr>
      <th width="120">글번호</th>
      <td id="num">${data.num}</td>
    </tr>
    <tr>
      <th>글쓴이</th>
      <td id="writer">${data.writer}</td>
    </tr>
    <tr>
      <th>비밀번호</th>
      <td><input type="password" id="pwd" name="pwd" size="12" maxlength="12"></td>
    </tr>
    <tr>
      <th>조회수</th>
      <td>${data.hit}</td>
    </tr>
    <tr>
      <th>제목</th>
      <td><input id="title" type="text" name="title" value="${data.title}" size="50" maxlength="50"></td>
    </tr>
    <tr>
      <th>내용</th>
      <td><textarea  id="content" rows="5" cols="50" id="content" name="content">${data.content}</textarea></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="button" value="수정" onclick="modify();">
        <input type="button" value="취소" onclick="delMod();">
        <span id="pwmsg"></span>
        
      </td>
    </tr>
  </table>`;
	boardEL.innerHTML = html;
}


const url = `${root}/post/${uid}`;
fetch(url, {
	headers: {
		'Content-Type': 'application/json;charset=utf-8'
	},
	method: "get"
})
	.then(res => res.json())
	.then(data => makeList(data))
	.catch(() => console.log("error"));