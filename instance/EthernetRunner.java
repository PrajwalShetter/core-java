
class EthernetRunner {

	public static void main(String[] args) {

		System.out.println("Type :" + Ethernet.type);
		System.out.println("Cable Type :" + Ethernet.cableType);
		System.out.println("Max Speed :" + Ethernet.maxSpeed);
		System.out.println("Wired :" + Ethernet.wired);
		System.out.println("Standard :" + Ethernet.standard);
		System.out.println("\n");

		
		Ethernet e1 = new Ethernet();
		System.out.println("This is First Ethernet \n");

		e1.connector = "RJ45";
		e1.length = "10m";
		e1.bandwidth = 100;
		e1.shielded = true;
		e1.usage = "Home";
		e1.ports = 2;
		e1.latency = 1.5;
		e1.origin = "USA";
		e1.secure = true;
		e1.compatibility = "PC";

		System.out.println("Model :" + e1.connector);
		System.out.println("Length :" + e1.length);
		System.out.println("Bandwidth :" + e1.bandwidth);
		System.out.println("Shielded :" + e1.shielded);
		System.out.println("Usage :" + e1.usage);
		System.out.println("Ports :" + e1.ports);
		System.out.println("Latency :" + e1.latency);
		System.out.println("Origin :" + e1.origin);
		System.out.println("Secure :" + e1.secure);
		System.out.println("Compatibility :" + e1.compatibility);
		System.out.println("\n");

		
		Ethernet e2 = new Ethernet();
		System.out.println("This is Second Ethernet \n");

		e2.connector = "RJ45";
		e2.length = "20m";
		e2.bandwidth = 1000;
		e2.shielded = false;
		e2.usage = "Office";
		e2.ports = 4;
		e2.latency = 0.8;
		e2.origin = "Germany";
		e2.secure = true;
		e2.compatibility = "Router";

		System.out.println("Connector :" + e2.connector);
		System.out.println("Length :" + e2.length);
		System.out.println("Bandwidth :" + e2.bandwidth);
		System.out.println("Shielded :" + e2.shielded);
		System.out.println("Usage :" + e2.usage);
		System.out.println("Ports :" + e2.ports);
		System.out.println("Latency :" + e2.latency);
		System.out.println("Origin :" + e2.origin);
		System.out.println("Secure :" + e2.secure);
		System.out.println("Compatibility :" + e2.compatibility);
		System.out.println("\n");

		
		Ethernet e3 = new Ethernet();
		System.out.println("This is Third Ethernet \n");

		e3.connector = "RJ45";
		e3.length = "5m";
		e3.bandwidth = 100;
		e3.shielded = true;
		e3.usage = "Gaming";
		e3.ports = 3;
		e3.latency = 1.0;
		e3.origin = "India";
		e3.secure = true;
		e3.compatibility = "Console";

		System.out.println("Connector :" + e3.connector);
		System.out.println("Length :" + e3.length);
		System.out.println("Bandwidth :" + e3.bandwidth);
		System.out.println("Shielded :" + e3.shielded);
		System.out.println("Usage :" + e3.usage);
		System.out.println("Ports :" + e3.ports);
		System.out.println("Latency :" + e3.latency);
		System.out.println("Origin :" + e3.origin);
		System.out.println("Secure :" + e3.secure);
		System.out.println("Compatibility :" + e3.compatibility);
		System.out.println("\n");

		
		Ethernet e4 = new Ethernet();
		System.out.println("This is Fourth Ethernet \n");

		e4.connector = "RJ45";
		e4.length = "15m";
		e4.bandwidth = 1000;
		e4.shielded = false;
		e4.usage = "Server";
		e4.ports = 6;
		e4.latency = 0.5;
		e4.origin = "Japan";
		e4.secure = true;
		e4.compatibility = "Server";

		System.out.println("Connector :" + e4.connector);
		System.out.println("Length :" + e4.length);
		System.out.println("Bandwidth :" + e4.bandwidth);
		System.out.println("Shielded :" + e4.shielded);
		System.out.println("Usage :" + e4.usage);
		System.out.println("Ports :" + e4.ports);
		System.out.println("Latency :" + e4.latency);
		System.out.println("Origin :" + e4.origin);
		System.out.println("Secure :" + e4.secure);
		System.out.println("Compatibility :" + e4.compatibility);
		System.out.println("\n");

		
		Ethernet e5 = new Ethernet();
		System.out.println("This is Fifth Ethernet \n");

		e5.connector = "RJ45";
		e5.length = "25m";
		e5.bandwidth = 1000;
		e5.shielded = true;
		e5.usage = "Enterprise";
		e5.ports = 8;
		e5.latency = 0.3;
		e5.origin = "UK";
		e5.secure = true;
		e5.compatibility = "Switch";

		System.out.println("Connector :" + e5.connector);
		System.out.println("Length :" + e5.length);
		System.out.println("Bandwidth :" + e5.bandwidth);
		System.out.println("Shielded :" + e5.shielded);
		System.out.println("Usage :" + e5.usage);
		System.out.println("Ports :" + e5.ports);
		System.out.println("Latency :" + e5.latency);
		System.out.println("Origin :" + e5.origin);
		System.out.println("Secure :" + e5.secure);
		System.out.println("Compatibility :" + e5.compatibility);
		System.out.println("\n");

		
		Ethernet e6 = new Ethernet();
		System.out.println("This is Sixth Ethernet \n");

		e6.connector = "RJ45";
		e6.length = "30m";
		e6.bandwidth = 100;
		e6.shielded = false;
		e6.usage = "School";
		e6.ports = 2;
		e6.latency = 2.0;
		e6.origin = "China";
		e6.secure = false;
		e6.compatibility = "Laptop";

		System.out.println("Connector :" + e6.connector);
		System.out.println("Length :" + e6.length);
		System.out.println("Bandwidth :" + e6.bandwidth);
		System.out.println("Shielded :" + e6.shielded);
		System.out.println("Usage :" + e6.usage);
		System.out.println("Ports :" + e6.ports);
		System.out.println("Latency :" + e6.latency);
		System.out.println("Origin :" + e6.origin);
		System.out.println("Secure :" + e6.secure);
		System.out.println("Compatibility :" + e6.compatibility);
		System.out.println("\n");

		
		Ethernet e7 = new Ethernet();
		System.out.println("This is Seventh Ethernet \n");

		e7.connector = "RJ45";
		e7.length = "8m";
		e7.bandwidth = 1000;
		e7.shielded = true;
		e7.usage = "Studio";
		e7.ports = 3;
		e7.latency = 0.7;
		e7.origin = "France";
		e7.secure = true;
		e7.compatibility = "PC";

		System.out.println("Connector :" + e7.connector);
		System.out.println("Length :" + e7.length);
		System.out.println("Bandwidth :" + e7.bandwidth);
		System.out.println("Shielded :" + e7.shielded);
		System.out.println("Usage :" + e7.usage);
		System.out.println("Ports :" + e7.ports);
		System.out.println("Latency :" + e7.latency);
		System.out.println("Origin :" + e7.origin);
		System.out.println("Secure :" + e7.secure);
		System.out.println("Compatibility :" + e7.compatibility);
		System.out.println("\n");

		
		Ethernet e8 = new Ethernet();
		System.out.println("This is Eighth Ethernet \n");

		e8.connector = "RJ45";
		e8.length = "12m";
		e8.bandwidth = 100;
		e8.shielded = false;
		e8.usage = "Backup";
		e8.ports = 2;
		e8.latency = 1.8;
		e8.origin = "Italy";
		e8.secure = false;
		e8.compatibility = "Router";

		System.out.println("Connector :" + e8.connector);
		System.out.println("Length :" + e8.length);
		System.out.println("Bandwidth :" + e8.bandwidth);
		System.out.println("Shielded :" + e8.shielded);
		System.out.println("Usage :" + e8.usage);
		System.out.println("Ports :" + e8.ports);
		System.out.println("Latency :" + e8.latency);
		System.out.println("Origin :" + e8.origin);
		System.out.println("Secure :" + e8.secure);
		System.out.println("Compatibility :" + e8.compatibility);
		System.out.println("\n");

		
		Ethernet e9 = new Ethernet();
		System.out.println("This is Ninth Ethernet \n");

		e9.connector = "RJ45";
		e9.length = "18m";
		e9.bandwidth = 1000;
		e9.shielded = true;
		e9.usage = "Data Center";
		e9.ports = 10;
		e9.latency = 0.2;
		e9.origin = "Canada";
		e9.secure = true;
		e9.compatibility = "Server";

		System.out.println("Connector :" + e9.connector);
		System.out.println("Length :" + e9.length);
		System.out.println("Bandwidth :" + e9.bandwidth);
		System.out.println("Shielded :" + e9.shielded);
		System.out.println("Usage :" + e9.usage);
		System.out.println("Ports :" + e9.ports);
		System.out.println("Latency :" + e9.latency);
		System.out.println("Origin :" + e9.origin);
		System.out.println("Secure :" + e9.secure);
		System.out.println("Compatibility :" + e9.compatibility);
		System.out.println("\n");

		
		Ethernet e10 = new Ethernet();
		System.out.println("This is Tenth Ethernet \n");

		e10.connector = "RJ45";
		e10.length = "40m";
		e10.bandwidth = 1000;
		e10.shielded = true;
		e10.usage = "Industrial";
		e10.ports = 12;
		e10.latency = 0.1;
		e10.origin = "South Korea";
		e10.secure = true;
		e10.compatibility = "Machine";

		System.out.println("Connector :" + e10.connector);
		System.out.println("Length :" + e10.length);
		System.out.println("Bandwidth :" + e10.bandwidth);
		System.out.println("Shielded :" + e10.shielded);
		System.out.println("Usage :" + e10.usage);
		System.out.println("Ports :" + e10.ports);
		System.out.println("Latency :" + e10.latency);
		System.out.println("Origin :" + e10.origin);
		System.out.println("Secure :" + e10.secure);
		System.out.println("Compatibility :" + e10.compatibility);
		System.out.println("\n");
	
	}
}