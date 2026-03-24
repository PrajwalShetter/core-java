class FoodItem{
	
	static String[] getIngridients(String item){
		
		System.out.println("the ingridients for making:"+item);
		
		if(item==null){
			System.out.println("item is invalid");
			return null;
		}
		
		if(item=="poha"){
			String[] ingridients={"poha","water","onion","potato","green chilies","peanuts","mustard seeds","curry leaves","turmeric powder","salt","sugar"};
			return ingridients;
		}
		
		if(item=="biriyani"){
			String[] ingridients={"rice","chicken","onion","oil","water","GG paste","tomato","spices","mint","coriander","water"};
			return ingridients;
		}
		
		if(item=="idli"){
			String[] ingridients={"rice","urad dal","salt"};
			return ingridients;
		}
		
		if(item=="dosa"){
			String[] ingridients={"rice","urad dal","salt","oil"};
			return ingridients;
		}
		
		if(item=="upma"){
			String[] ingridients={"rava","onion","green chilies","mustard seeds","curry leaves","jeera","oil","water","GG paste"};
			return ingridients;
		}
		
		if(item=="pongal"){
			String[] ingridients={"rice","moong dal","pepper","cumin","ghee","oil","water"};
			return ingridients;
		}
		
		if(item=="vada"){
			String[] ingridients={"urad dal","onion","green chilies","curry leaves","salt"};
			return ingridients;
		}
		
		if(item=="puri"){
			String[] ingridients={"wheat flour","salt","oil"};
			return ingridients;
		}
		
		if(item=="chapati"){
			String[] ingridients={"wheat flour","water","salt"};
			return ingridients;
		}
		
		if(item=="paratha"){
			String[] ingridients={"wheat flour","oil","salt","potato","chilli powder","turmeric powder"};
			return ingridients;
		}
		
		if(item=="fried rice"){
			String[] ingridients={"rice","vegetables","soy sauce","oil"};
			return ingridients;
		}
		
		if(item=="noodles"){
			String[] ingridients={"noodles","vegetables","sauces","oil"};
			return ingridients;
		}
		
		if(item=="pizza"){
			String[] ingridients={"flour","cheese","sauce","toppings"};
			return ingridients;
		}
		
		if(item=="burger"){
			String[] ingridients={"bun","patty","tomato","sauce"};
			return ingridients;
		}
		
		if(item=="sandwich"){
			String[] ingridients={"bread","butter","vegetables","chutney"};
			return ingridients;
		}
		
		if(item=="pasta"){
			String[] ingridients={"pasta","sauce","vegetables","cheese"};
			return ingridients;
		}
		
		if(item=="samosa"){
			String[] ingridients={"flour","potato","peas","spices","oil"};
			return ingridients;
		}
		
		if(item=="pav bhaji"){
			String[] ingridients={"pav","vegetables","butter","spices"};
			return ingridients;
		}
		
		if(item=="chole bhature"){
			String[] ingridients={"chickpeas","flour","spices","oil"};
			return ingridients;
		}
		
		if(item=="rajma rice"){
			String[] ingridients={"rajma","rice","spices"};
			return ingridients;
		}
		
		if(item=="dal tadka"){
			String[] ingridients={"dal","onion","tomato","spices","ghee"};
			return ingridients;
		}
		
		if(item=="paneer butter masala"){
			String[] ingridients={"paneer","tomato","cream","butter","spices"};
			return ingridients;
		}
		
		if(item=="chicken curry"){
			String[] ingridients={"chicken","onion","tomato","spices"};
			return ingridients;
		}
		
		if(item=="fish fry"){
			String[] ingridients={"fish","spices","oil"};
			return ingridients;
		}
		
		if(item=="omelette"){
			String[] ingridients={"eggs","onion","green chilies","salt","oil"};
			return ingridients;
		}
		
		if(item=="maggi"){
			String[] ingridients={"noodles","tastemaker","water"};
			return ingridients;
		}
		
		if(item=="momos"){
			String[] ingridients={"flour","vegetables","spices"};
			return ingridients;
		}
		
		if(item=="spring rolls"){
			String[] ingridients={"wrappers","vegetables","sauce"};
			return ingridients;
		}
		
		if(item=="ice cream"){
			String[] ingridients={"milk","sugar","cream"};
			return ingridients;
		}
		
		if(item=="gulab jamun"){
			String[] ingridients={"milk powder","sugar syrup","oil"};
			return ingridients;
		}
		
		if(item=="jalebi"){
			String[] ingridients={"flour","sugar syrup","oil"};
			return ingridients;
		}
		
		System.out.println("item not found");
		return null;
	}
}