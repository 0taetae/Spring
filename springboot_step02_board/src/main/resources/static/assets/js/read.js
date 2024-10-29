const pathname = "/" + window.location.pathname.split("/")[1];
const origin = window.location.origin;
const root = origin + pathname;
const uid = window.location.pathname.split("/")[3];
function modify() { // 글 수정
	location.href = `${root}/update/${uid}`;
}

function delview() {
	console.log("aaaa");
	document.getElementById('frm1').style.display = 'inline';
	document.getElementById('span1').style.visibility = 'hidden';
}

function del() { // 글 삭제
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
		"title": ttInput.innerHTML,
		"content": ctInput.innerHTML,
		"pwd": pwInput.value
	}
	console.log("info ", info);

	const delUrl = `${root}/post`;
	fetch(delUrl, {
		body: JSON.stringify(info),
		headers: {
			'Content-Type': 'application/json;charset=utf-8'
		},
		method: "delete"
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

function cancel() {
	document.getElementById('frm1').style.display = 'none';
	document.getElementById('span1').style.visibility = '';
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
      <th>조회수</th>
      <td>${data.hit}</td>
    </tr>
    <tr>
      <th>제목</th>
      <td id="title">${data.title}</td>
    </tr>
    <tr>
      <th>내용</th>
      <td id="content">${data.content}</td>
    </tr>
    <tr>
      <td colspan="2">
        <span id="span1">
          <input type="button" value="글수정" onclick="modify();">
          <input type="button" value="글삭제" onclick="delview();">
        </span>
        <span id="frm1" name="frm1" style="display:none">
          <input type="hidden" name="num" value="">
          비밀번호 : <input type="password" id="pwd" name="pwd" size="12" maxlength="12">
          <input type="button" value="Del" onclick="del();">
          <input type="button" value="Cancel" onclick="cancel();">
          <span id="pwmsg"></span>
        </span>
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
