package com.edu.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.board.model.Board;
import com.edu.board.model.service.BoardService;

@RestController
public class BoardRestController {
	@Autowired
	private BoardService service;
	
	@PostMapping("/post")
	public ResponseEntity<?> insertPost(@RequestBody Board ob) throws Exception {
		try {
			return new ResponseEntity<Boolean>(service.insertPost(ob), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("서버 오류", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/post")
	public ResponseEntity<?> listPost() throws Exception {
		try {
			return new ResponseEntity<List<Board>>(service.listPost(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("서버 오류", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/post")
	public ResponseEntity<?> updatePost(@RequestBody Board ob) throws Exception {
		try {
			int res = service.updatePost(ob);
			System.out.println("update count="+res);
			if(res < 1) throw new Exception();
			return new ResponseEntity<Board>(service.readPost(ob.getNum()), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("서버 오류", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/post")
	public ResponseEntity<?> deletePost(@RequestBody Board ob) throws Exception {
		try {
			int res = service.deletePost(ob);
			System.out.println("delete count="+res);
			if(res < 1) throw new Exception();
			return new ResponseEntity<String>("성공", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("서버 오류", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/post/{id}")
	public ResponseEntity<?> readPost(@PathVariable("id") int id) throws Exception {
		try {
			service.updateHit(id);
			Board b = service.readPost(id);
			return new ResponseEntity<Board>(b, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("서버 오류", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
