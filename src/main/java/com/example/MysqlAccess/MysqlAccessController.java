package com.example.MysqlAccess;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.MysqlAccess.Entity.Customer;
import com.example.MysqlAccess.Repository.CustomerRepository;

@Controller
@EnableAutoConfiguration
public class MysqlAccessController {
	@Autowired	
	private CustomerRepository customerRepository;
		
	@RequestMapping("/")
	public String index() {
		// DBアクセスTop画面を表示
		return "index";
	}
	
	@GetMapping(path="/all")
	public String list(Model model) {
		// M_CUSTOMERテーブルの全データを取得
		ArrayList<Customer> customerList = customerRepository.getAll();
		
		// モデルに属性追加
		model.addAttribute("customerlist",customerList);
		
		// データ一覧画面を表示
		return "list.html";
	}
	
	@RequestMapping("/insert")
	public String insert() {
		// データ登録画面を表示
		return "insert";
	}
	
	// DB登録処理
	@PostMapping(path="/register")
	public @ResponseBody String addNewCustomer(	  @RequestParam String c_cd 
										, @RequestParam String c_name
										, @RequestParam String address
										, @RequestParam String tel) {
	
		Customer customerAddData = new Customer();
		customerAddData.setAll(c_cd,c_name,address,tel);
	
		
		customerRepository.save(customerAddData);
		
		return "登録しました";
	}
}
