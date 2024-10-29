const boardListEL=document.querySelector("#boardList");
const uid = window.location.pathname.split("/")[3];
const pathname = "/" + window.location.pathname.split("/")[1];
const origin = window.location.origin;
const root = origin + pathname;

const makeList = (list)=>{
	console.log(list);
	let html = `<table>
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>날짜</th>
						<th>조회</th>
					</tr>
				</thead>
				<tbody></tbody>
			<table>`;
	boardListEL.innerHTML = html;
	
	const tbody = boardListEL.querySelector("tbody");
	list.forEach((index)=>{
		const tr = document.createElement("tr");
		tr.setAttribute("data-id", index.num);
		const inner = `
				<td>${index.num}</td>
				<td>${index.title}</td>
				<td>${index.writer}</td>
				<td>${index.regdate}</td>
				<td>${index.hit}</td
		`
		tr.innerHTML = inner;
		tbody.appendChild(tr);
		tr.style.cursor = "pointer";
		tr.addEventListener("click", clickPost);
	})
}

function clickPost(event){
	const target = event.currentTarget;
	const uid = target.getAttribute("data-id");
	console.log(uid);	
	location.href = `${root}/list/${uid}`;
}


const url = 'post';
fetch(url)
.then(res => res.json())
.then(data => makeList(data))
.catch(()=> console.log("error"));