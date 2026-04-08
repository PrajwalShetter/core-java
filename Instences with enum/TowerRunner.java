class TowerRunner{
	
	public static void main(String... args){
		
		CellTower celltower = new CellTower("Koppal", "Karnataka");
		celltower.display();
		
		Tower tower = celltower.details();
		tower.display();
	}
}