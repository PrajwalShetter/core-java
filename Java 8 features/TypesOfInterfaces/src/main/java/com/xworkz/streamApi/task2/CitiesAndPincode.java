package com.xworkz.streamApi.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Locale.filter;

public class CitiesAndPincode {

    private static int sumDigits(int pincode) {

        return String.valueOf(pincode)
                .chars()
                .map(ch -> ch - '0')
                .sum();
    }

    public static void main(String[] args) {

        List<String> cities = Arrays.asList(
                "Bengaluru", "Mysuru", "Hubballi", "Dharwad", "Belagavi",
                "Mangaluru", "Shivamogga", "Tumakuru", "Ballari", "Vijayapura",
                "Kalaburagi", "Raichur", "Bidar", "Kolar", "Chikkamagaluru",
                "Hassan", "Mandya", "Udupi", "Karwar", "Bagalkot",
                "Gadag", "Haveri", "Chitradurga", "Davanagere", "Koppal",
                "Yadgir", "Ramanagara", "Chikkaballapur", "Kodagu", "Sirsi",

                "Hyderabad", "Warangal", "Karimnagar", "Nizamabad", "Khammam",
                "Adilabad", "Mahbubnagar", "Siddipet", "Medak", "Suryapet",
                "Nalgonda", "Jagitial", "Mancherial", "Kamareddy", "Sangareddy",
                "Wanaparthy", "Bhongir", "Vikarabad", "Jangaon", "Peddapalli",

                "Visakhapatnam", "Vijayawada", "Guntur", "Tirupati", "Kurnool",
                "Nellore", "Rajahmundry", "Kakinada", "Kadapa", "Anantapur",
                "Eluru", "Ongole", "Machilipatnam", "Chittoor", "Srikakulam",
                "Vizianagaram", "Amalapuram", "Tenali", "Hindupur", "Nandyal",

                "Chennai", "Coimbatore", "Madurai", "Salem", "Tiruchirappalli",
                "Tirunelveli", "Erode", "Vellore", "Thoothukudi", "Dindigul",
                "Karur", "Namakkal", "Cuddalore", "Nagapattinam", "Thanjavur",
                "Kanchipuram", "Hosur", "Pollachi", "Kumbakonam", "Sivakasi",

                "Kochi", "Thiruvananthapuram", "Kozhikode", "Thrissur", "Kannur",
                "Palakkad", "Kollam", "Alappuzha", "Kottayam", "Malappuram",
                "Pathanamthitta", "Kasaragod", "Idukki", "Wayanad", "Ponnani",
                "Changanassery", "Perinthalmanna", "Kayamkulam", "Nedumangad", "Attingal",

                "Mumbai", "Pune", "Nagpur", "Nashik", "Aurangabad",
                "Kolhapur", "Solapur", "Amravati", "Jalgaon", "Akola",
                "Latur", "Satara", "Sangli", "Ratnagiri", "Ahmednagar",
                "Chandrapur", "Nanded", "Beed", "Parbhani", "Dhule",

                "Ahmedabad", "Surat", "Vadodara", "Rajkot", "Bhavnagar",
                "Jamnagar", "Junagadh", "Anand", "Gandhinagar", "Morbi",
                "Navsari", "Porbandar", "Mehsana", "Palanpur", "Valsad",
                "Bharuch", "Godhra", "Veraval", "Amreli", "Bhuj",

                "Jaipur", "Jodhpur", "Udaipur", "Kota", "Ajmer",
                "Bikaner", "Alwar", "Bharatpur", "Sikar", "Pali",
                "Barmer", "Churu", "Nagaur", "Tonk", "Bhilwara",
                "Hanumangarh", "Dausa", "Jaisalmer", "Sri Ganganagar", "Jhunjhunu",

                "Lucknow", "Kanpur", "Varanasi", "Prayagraj", "Agra",
                "Meerut", "Ghaziabad", "Noida", "Aligarh", "Bareilly",
                "Moradabad", "Jhansi", "Mathura", "Ayodhya", "Gorakhpur",
                "Firozabad", "Saharanpur", "Muzaffarnagar", "Rampur", "Unnao",

                "Patna", "Gaya", "Muzaffarpur", "Bhagalpur", "Darbhanga",
                "Purnia", "Ara", "Begusarai", "Katihar", "Munger",
                "Samastipur", "Sasaram", "Buxar", "Motihari", "Sitamarhi",
                "Siwan", "Nawada", "Jamui", "Kishanganj", "Madhubani",

                "Ranchi", "Jamshedpur", "Dhanbad", "Bokaro", "Hazaribagh",
                "Deoghar", "Giridih", "Ramgarh", "Dumka", "Chaibasa",
                "Medininagar", "Godda", "Latehar", "Lohardaga", "Simdega",

                "Bhubaneswar", "Cuttack", "Rourkela", "Sambalpur", "Berhampur",
                "Balasore", "Puri", "Baripada", "Jharsuguda", "Jeypore",
                "Koraput", "Angul", "Bhadrak", "Kendrapara", "Rayagada",

                "Kolkata", "Howrah", "Durgapur", "Asansol", "Siliguri",
                "Malda", "Kharagpur", "Haldia", "Bardhaman", "Darjeeling",
                "Raiganj", "Krishnanagar", "Bankura", "Purulia", "Jalpaiguri",

                "Bhopal", "Indore", "Jabalpur", "Gwalior", "Ujjain",
                "Sagar", "Satna", "Rewa", "Ratlam", "Dewas",
                "Chhindwara", "Katni", "Shivpuri", "Vidisha", "Sehore",

                "Raipur", "Bilaspur", "Durg", "Korba", "Jagdalpur",
                "Rajnandgaon", "Raigarh", "Ambikapur", "Dhamtari", "Mahasamund",

                "Bengaluru", "Mysuru", "Hubballi", "Dharwad", "Belagavi", "Mangaluru", "Shivamogga", "Tumakuru", "Ballari", "Vijayapura",
                "Kalaburagi", "Raichur", "Bidar", "Kolar", "Chikkamagaluru", "Hassan", "Mandya", "Udupi", "Karwar", "Bagalkot",
                "Gadag", "Haveri", "Chitradurga", "Davanagere", "Koppal", "Yadgir", "Ramanagara", "Chikkaballapur", "Madikeri", "Sirsi",
                "Hospet", "Gokak", "Ranebennur", "Sagara", "Bhadravati", "Sindhanur", "Jamkhandi", "Ilkal", "Mudhol", "Athani",
                "Hyderabad", "Warangal", "Karimnagar", "Nizamabad", "Khammam", "Adilabad", "Mahbubnagar", "Siddipet", "Medak", "Suryapet",
                "Nalgonda", "Jagitial", "Mancherial", "Kamareddy", "Sangareddy", "Wanaparthy", "Bhongir", "Vikarabad", "Jangaon", "Peddapalli",
                "Visakhapatnam", "Vijayawada", "Guntur", "Tirupati", "Kurnool", "Nellore", "Rajahmundry", "Kakinada", "Kadapa", "Anantapur",
                "Eluru", "Ongole", "Machilipatnam", "Chittoor", "Srikakulam", "Vizianagaram", "Amalapuram", "Tenali", "Hindupur", "Nandyal",
                "Chennai", "Coimbatore", "Madurai", "Salem", "Tiruchirappalli", "Tirunelveli", "Erode", "Vellore", "Thoothukudi", "Dindigul",
                "Karur", "Namakkal", "Cuddalore", "Nagapattinam", "Thanjavur", "Kanchipuram", "Hosur", "Pollachi", "Kumbakonam", "Sivakasi",

                "Kochi", "Thiruvananthapuram", "Kozhikode", "Thrissur", "Kannur", "Palakkad", "Kollam", "Alappuzha", "Kottayam", "Malappuram",
                "Pathanamthitta", "Kasaragod", "Idukki", "Kalpetta", "Ponnani", "Changanassery", "Perinthalmanna", "Kayamkulam", "Nedumangad", "Attingal",
                "Mumbai", "Pune", "Nagpur", "Nashik", "Aurangabad", "Kolhapur", "Solapur", "Amravati", "Jalgaon", "Akola",
                "Latur", "Satara", "Sangli", "Ratnagiri", "Ahmednagar", "Chandrapur", "Nanded", "Beed", "Parbhani", "Dhule",
                "Wardha", "Yavatmal", "Osmanabad", "Bhandara", "Gondia", "Washim", "Hingoli", "Buldhana", "Sindhudurg", "Palghar",
                "Ahmedabad", "Surat", "Vadodara", "Rajkot", "Bhavnagar", "Jamnagar", "Junagadh", "Anand", "Gandhinagar", "Morbi",
                "Navsari", "Porbandar", "Mehsana", "Palanpur", "Valsad", "Bharuch", "Godhra", "Veraval", "Amreli", "Bhuj",
                "Surendranagar", "Botad", "Dahod", "Patan", "Modasa", "Nadiad", "Kalol", "Vapi", "Ankleshwar", "Deesa",
                "Jaipur", "Jodhpur", "Udaipur", "Kota", "Ajmer", "Bikaner", "Alwar", "Bharatpur", "Sikar", "Pali",
                "Barmer", "Churu", "Nagaur", "Tonk", "Bhilwara", "Hanumangarh", "Dausa", "Jaisalmer", "Sri Ganganagar", "Jhunjhunu",

                "Lucknow", "Kanpur", "Varanasi", "Prayagraj", "Agra", "Meerut", "Ghaziabad", "Noida", "Aligarh", "Bareilly",
                "Moradabad", "Jhansi", "Mathura", "Ayodhya", "Gorakhpur", "Firozabad", "Saharanpur", "Muzaffarnagar", "Rampur", "Unnao",
                "Sitapur", "Hardoi", "Faizabad", "Etawah", "Mainpuri", "Budaun", "Shahjahanpur", "Pilibhit", "Lakhimpur", "Amroha",
                "Patna", "Gaya", "Muzaffarpur", "Bhagalpur", "Darbhanga", "Purnia", "Ara", "Begusarai", "Katihar", "Munger",
                "Samastipur", "Sasaram", "Buxar", "Motihari", "Sitamarhi", "Siwan", "Nawada", "Jamui", "Kishanganj", "Madhubani",
                "Ranchi", "Jamshedpur", "Dhanbad", "Bokaro", "Hazaribagh", "Deoghar", "Giridih", "Ramgarh", "Dumka", "Chaibasa",
                "Medininagar", "Godda", "Latehar", "Lohardaga", "Simdega", "Pakur", "Jamtara", "Saraikela", "Khunti", "Gumla",
                "Bhubaneswar", "Cuttack", "Rourkela", "Sambalpur", "Berhampur", "Balasore", "Puri", "Baripada", "Jharsuguda", "Jeypore",
                "Koraput", "Angul", "Bhadrak", "Kendrapara", "Rayagada", "Keonjhar", "Dhenkanal", "Bargarh", "Phulbani", "Paradeep",
                "Kolkata", "Howrah", "Durgapur", "Asansol", "Siliguri", "Malda", "Kharagpur", "Haldia", "Bardhaman", "Darjeeling",

                "Raiganj", "Krishnanagar", "Bankura", "Purulia", "Jalpaiguri", "Cooch Behar", "Alipurduar", "Baharampur", "Bolpur", "Contai",
                "Bhopal", "Indore", "Jabalpur", "Gwalior", "Ujjain", "Sagar", "Satna", "Rewa", "Ratlam", "Dewas",
                "Chhindwara", "Katni", "Shivpuri", "Vidisha", "Sehore", "Mandsaur", "Neemuch", "Burhanpur", "Khandwa", "Hoshangabad",
                "Raipur", "Bilaspur", "Durg", "Korba", "Jagdalpur", "Rajnandgaon", "Raigarh", "Ambikapur", "Dhamtari", "Mahasamund",
                "Kawardha", "Janjgir", "Bemetara", "Balod", "Kanker", "Sukma", "Bijapur", "Narayanpur", "Mungeli", "Balrampur",
                "Delhi", "Gurugram", "Faridabad", "Panipat", "Karnal", "Rohtak", "Hisar", "Ambala", "Sonipat", "Yamunanagar",
                "Kurukshetra", "Kaithal", "Jind", "Bhiwani", "Rewari", "Sirsa", "Fatehabad", "Palwal", "Narnaul", "Bahadurgarh",
                "Chandigarh", "Ludhiana", "Amritsar", "Jalandhar", "Patiala", "Bathinda", "Mohali", "Pathankot", "Hoshiarpur", "Moga",
                "Firozpur", "Kapurthala", "Barnala", "Sangrur", "Abohar", "Batala", "Phagwara", "Muktsar", "Rupnagar", "Khanna",

                "Shimla", "Solan", "Mandi", "Dharamshala", "Hamirpur", "Una", "Bilaspur", "Nahan", "Kullu", "Manali",
                "Dehradun", "Haridwar", "Rishikesh", "Roorkee", "Haldwani", "Rudrapur", "Almora", "Nainital", "Pithoragarh", "Kotdwar",
                "Srinagar", "Anantnag", "Baramulla", "Kupwara", "Pulwama", "Kathua", "Udhampur", "Leh", "Kargil", "Kishtwar",
                "Guwahati", "Dispur", "Silchar", "Dibrugarh", "Jorhat", "Tezpur", "Nagaon", "Tinsukia", "Bongaigaon", "Dhubri",
                "Shillong", "Tura", "Nongstoin", "Jowai", "Baghmara", "Williamnagar", "Resubelpara", "Mairang", "Ampati", "Mawkyrwat",
                "Aizawl", "Lunglei", "Champhai", "Kolasib", "Serchhip", "Saiha", "Lawngtlai", "Mamit", "Khawzawl", "Saitual",
                "Imphal", "Thoubal", "Bishnupur", "Ukhrul", "Churachandpur", "Senapati", "Tamenglong", "Kakching", "Moirang", "Jiribam",
                "Kohima", "Dimapur", "Mokokchung", "Tuensang", "Wokha", "Mon", "Zunheboto", "Phek", "Longleng", "Kiphire",
                "Itanagar", "Naharlagun", "Pasighat", "Tawang", "Ziro", "Bomdila", "Roing", "Tezu", "Aalo", "Namsai",
                "Agartala", "Udaipur", "Dharmanagar", "Belonia", "Kailashahar", "Khowai", "Ambassa", "Sabroom", "Kumarghat", "Sonamura"
        );

        List<Integer> pincodes = new ArrayList<>();
        for(int i =1; i <= 800; i++){
            pincodes.add(500000 + i);
        }

        //pincode between 500000-500300
        IntStream.range(0, cities.size())
                .filter(i->pincodes.get(i)>=500000 && pincodes.get(i)<=500300)
                .forEach(i-> System.out.println(cities.get(i)+ "  "+pincodes.get(i)));

        //city name length >6
        IntStream.range(0, cities.size()).filter(i->cities.get(i).length()>6)
                .forEach(i-> System.out.println(cities.get(i)));

        //pincode contains digit '1'
        System.out.println("pincode contains digit '1'");
        IntStream.range(0, cities.size())
                .filter(i->String.valueOf(pincodes.get(i)).contains("1"))
                .forEach(i-> System.out.println(cities.get(i)+" "+pincodes.get(i)));

        //Even pincode
        pincodes.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        //odd pincodes
        System.out.println("odd pincodes");
        pincodes.stream()
                .filter(i->i % 2 !=0)
                .forEach(System.out::println);


        //city starts with M and D
        cities.stream().
                filter(city->city.startsWith("M")||city.startsWith("D"))
                .forEach(System.out::println);

        //pincode divisible by 3
        pincodes.stream()
                .filter(i->i%3 == 0)
                .forEach(i-> System.out.println(i));


//        //sum of digits >20

         pincodes.stream()
                         .filter(pincode->String.valueOf(pincode)
                                         .chars()
                                         .map(ch->ch-'0')
                                         .sum()>20)
                 .forEach(System.out::println);

        //city contains a
        cities.stream()
                .filter(city->city.toLowerCase().contains("a"))
                .forEach(city-> System.out.println(city));

//        //pincodes ends with 001
        pincodes.stream()
                .filter(pincode->pincode % 1000 == 1)
                .forEach(System.out::println);
    }
}
