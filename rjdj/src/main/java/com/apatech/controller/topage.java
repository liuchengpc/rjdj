package com.apatech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apatech.domain.Shop;

@Controller
@RequestMapping("topage")
public class topage {
	
	@RequestMapping("/tzs")
	public String selectAll(String tz) {
		System.out.println("进入跳转");
		System.out.println(tz);
		return tz;
	}
	@RequestMapping("/login")
	public String login() {
		System.out.println("进入login");
		return "login";
	}
	@RequestMapping("/accountindex")
	public String accountindex() {
		System.out.println("进入accountindex");
		return "accountindex";
	}
	@RequestMapping("/AddForm")
	public String AddForm() {
		System.out.println("进入AddForm");
		return "AddForm";
	}
	
	
	@RequestMapping("page/claim/users_img")
	public String users_img() {
		System.out.println("进入page/claim/users_img");
		return "page/claim/users_img";
	}
	@RequestMapping("page/common/body_menu6")
	public String body_menu6() {
		System.out.println("进入page/common/body_menu6");
		return "page/common/body_menu6";
	}
	@RequestMapping("page/claim/users_home")
	public String accountinfo() {
		System.out.println("进入page/claim/users_home");
		return "page/claim/users_home";
	}
	
	@RequestMapping("page/claim/shop_Insert")
	public String shop_Insert() {
		System.out.println("进入page/claim/shop_Insert");
		return "page/claim/shop_Insert";
	}
	@RequestMapping("page/claim/shop_Query")
	public String shop_Query() {
		System.out.println("进入page/claim/shop_Query");
		return "page/claim/shop_Query";
	}
	@RequestMapping("page/common/body_menu")
	public String body_menu() {
		System.out.println("进入page/common/body_menu");
		return "page/common/body_menu";
	}
	@RequestMapping("page/claim/store_management")
	public String store_management() {
		System.out.println("进入page/claim/store_management");
		return "page/claim/store_management";
	}
	@RequestMapping("page/claim/position")
	public String position() {
		System.out.println("进入page/claim/position");
		return "page/claim/position";
	}
	@RequestMapping("page/claim/employee_management")
	public String employee_management() {
		System.out.println("进入page/claim/employee_management");
		return "page/claim/employee_management";
	}
	@RequestMapping("page/common/body_menu2")
	public String body_menu2() {
		System.out.println("进入page/common/body_menu2");
		return "page/common/body_menu2";
	}
	@RequestMapping("page/claim/shop_type")
	public String shop_type() {
		System.out.println("进入page/claim/shop_type");
		return "page/claim/shop_type";
	}
	@RequestMapping("page/claim/shop_managerment")
	public String shop_managerment() {
		System.out.println("进入page/claim/shop_managerment");
		return "page/claim/shop_managerment";
	}
	@RequestMapping("shop_upload")
	public String shop_upload() {
		System.out.println("进入shop_upload");
		return "shop_upload";
	}
	@RequestMapping("page/claim/supplier")
	public String supplier() {
		System.out.println("进入page/claim/supplier");
		return "page/claim/supplier";
	}
	@RequestMapping("page/claim/purchase_list")
	public String purchase_list() {
		System.out.println("进入page/claim/purchase_list");
		return "page/claim/purchase_list";
	}
	@RequestMapping("page/claim/cashRegister_Home")
	public String cashRegister_Home() {
		System.out.println("进入page/claim/cashRegister_Home");
		return "page/claim/cashRegister_Home";
	}
	@RequestMapping("page/common/body_menu4")
	public String body_menu4() {
		System.out.println("进入page/common/body_menu4");
		return "page/common/body_menu4";
	}
	@RequestMapping("page/claim/salesStatistics")
	public String salesStatistics() {
		System.out.println("进入page/claim/salesStatistics");
		return "page/claim/salesStatistics";
	}
	@RequestMapping("page/claim/RevenueProfile")
	public String RevenueProfile() {
		System.out.println("进入page/claim/salesStatistics");
		return "page/claim/salesStatistics";
	}
	@RequestMapping("page/claim/PopularGoods")
	public String PopularGoods() {
		System.out.println("进入page/claim/PopularGoods");
		return "page/claim/PopularGoods";
	}
	@RequestMapping("page/claim/PerformanceRanking")
	public String PerformanceRanking() {
		System.out.println("进入page/claim/PerformanceRanking");
		return "page/claim/PerformanceRanking";
	}
	@RequestMapping("page/claim/CashierHandover")
	public String CashierHandover() {
		System.out.println("进入page/claim/CashierHandover");
		return "page/claim/CashierHandover";
	}
	@RequestMapping("page/common/body_menu5")
	public String body_menu5() {
		System.out.println("进入page/common/body_menu5");
		return "page/common/body_menu5";
	}
	@RequestMapping("page/claim/member_info")
	public String member_info() {
		System.out.println("进入page/claim/member_info");
		return "page/claim/member_info";
	}
	@RequestMapping("page/claim/level_set")
	public String level_set() {
		System.out.println("进入page/claim/level_set");
		return "page/claim/level_set";
	}
	@RequestMapping("page/claim/integer_set")
	public String integer_set() {
		System.out.println("进入page/claim/integer_set");
		return "page/claim/integer_set";
	}
	@RequestMapping("page/claim/recharge_deduction")
	public String recharge_deduction() {
		System.out.println("进入page/claim/recharge_deduction");
		return "page/claim/recharge_deduction";
	}
	@RequestMapping("page/claim/transaction_record")
	public String transaction_record() {
		System.out.println("进入page/claim/transaction_record");
		return "page/claim/transaction_record";
	}
	@RequestMapping("page/common/footer")
	public String footer() {
		System.out.println("进入page/common/footer");
		return "page/common/footer";
	}
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/NewFile")
	public String NewFile() {
		return "NewFile";
	}
	@RequestMapping("/add")
	public String add() {
		return "add";
	}
	@RequestMapping("/update")
	public String update() {
		return "update";
	}
	
	@RequestMapping("/toupload")
	public String toupload() {
		return "upload";
	}
}