class NewsPaperStore{
	
	NewsPaper[] newspapers = new NewsPaper[100];
	int index =0;
	
	//save single paper
	void save(NewsPaper newspaper){
		
		if(newspaper != null){
			if(this.index<this.newspapers.length){
				this.newspapers[index]=newspaper;
				System.out.println("saved newspapaer at index :"+this.index);
				index++;
			}
		}
		else{
			System.out.println("newspaper cannot be null");
		}
	}
	
	// save mulptiple papers
	void saveAll(NewsPaper[] newspapers){
		System.out.println("svae multiple newspapers at a time");
		if(newspapers != null){
			
			for(NewsPaper arr : newspapers){
				if(arr != null){
					save(arr);
				}
			}
			
		}
		else{
			System.out.println("newspapers cannot be null");
		}
	}
	
	void findByName(String name){
		System.out.println("Finding the newspaper details by its name :"+name);
		if(name != null){
			int count =0;
			for(NewsPaper arr : newspapers){
				
				if(arr != null && name.equals(arr.name)){
					System.out.println("yes, name is matched, displaying the dtails of the newspaper");
					arr.display();
					count =1;
				}
			}
			if(count == 0){
				System.out.println("sry, can't find the name try with new one");
			}
		}
		else{
			System.out.println("Name cannot be null");
		}
	}
	
	void display(){
		System.out.println("Display all newspapers");
		int count =0;
		for(NewsPaper arr : newspapers){
			if(arr != null){
			arr.display();
			count++;
		}
		}
		if(count ==0){
			System.out.println("Array is Empty");
		}
	}
	
	String findPaperQualityByName(String name){
		System.out.println("Finding the paper quality by its name of the paper :"+name);
		if(name != null){
			boolean found = false;
			for(NewsPaper arr : newspapers){
				if(arr != null && name.equals(arr.name)){
					System.out.println("The paper quality of the given name : "+arr.paperQuality);
					found =true;
					break;
				}
			}
			if(!found){
				System.out.println("the name is not found");
			}
			
		}
		else{
			System.out.println("Name can't be null");
			return null;
		}
		return null;
	}
	
	int findNoOfPagesByNameAndHeadEditor(String name,String headEditor){
		System.out.println("Finding the noOfPages by Name and headEditor:"+name +"," + headEditor);
		if(name != null && headEditor != null){
			boolean found=false;
			for(NewsPaper arr : newspapers){
				if(arr != null && name.equals(arr.name) && headEditor.equals(arr.headEditor)){
					System.out.println("The number of pages of based on name and headeditor :"+arr.noOfPages);
					found =true;
					return arr.noOfPages;
				}
			}
			if(!found){
				System.out.println("the name and head editor is not matching");
			}
		}
		else{
			System.out.println("Name and headEditor can not be null");
			return 0;
		}
		return 0;
	}
	
	void updateLangByName(String name,Lang newLang){
		System.out.println("Updating language by finding the name of the paper :"+name);
		if(name != null && newLang != null){
			int count =0;
			for(NewsPaper arr : newspapers){
				
				if(arr != null && name.equals(arr.name)){
					arr.lang = newLang;
					System.out.println("updated the language by name : "+arr.lang);
					arr.display();
					count++;
				}
			}
			if(count == 0){
				System.out.println("sry,name of the paper can't found");
			}
		}
		else{
			System.out.println("The name and language is can not be null");
		}
	}
	
	void updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight (InkColor inkColor,int noOfImages,double fontSize,String name,double height,double weight){
		System.out.println("Updating inkColor, noOfImages and fontSize by name, height and weight :"+name+"," +height +"," + weight);
		if(inkColor != null && noOfImages >0 && fontSize >0.00 && name != null && height>0.00 && weight>0.00){
			boolean found = false;
			for(NewsPaper arr : newspapers){
				if(arr != null && name.equals(arr.name) && height == arr.height && weight == arr.weight){
					arr.inkColor = inkColor;
					arr.noOfImages = noOfImages;
					arr.fontSize = fontSize;
					arr.display();
					found =true;
				}
			}
			if(!found){
				System.out.println("the name, height, weight is not matched");
			}
		}
		else{
			System.out.println("null detected");
			
		}
	}
	
	void replaceByPrintHouseAddress(String printHouseAddress,NewsPaper newsPaper){
	
	if(printHouseAddress != null && newsPaper != null){
		
		boolean found = false;
		
		for(int i = 0; i < newspapers.length; i++){
			
			if(newspapers[i] != null && printHouseAddress.equals(newspapers[i].printHouseAddress)){
				
				newspapers[i] = newsPaper;
				System.out.println("Replaced at index : " + i);
				found = true;
				newspapers[i].display();
				break;
			}
		}
		
		if(!found){
			System.out.println("PrintHouseAddress not found");
		}
		
	}
	else{
		System.out.println("The printHouseAddress and newsPaper can not be null");
	}
}
}