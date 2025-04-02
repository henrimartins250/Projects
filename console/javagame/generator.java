import java.util.Random;


public class generator {
    

    public String FruitPicker(){

            Random rand = new Random();

            int fruit = rand.nextInt(100);
        String[] fruits = {
            "Apple", "Banana", "Orange", "Grapes", "Mango", "Pineapple", "Strawberry", "Blueberry", "Raspberry", "Peach",
            "Watermelon", "Papaya", "Kiwi", "Lemon", "Lime", "Cherry", "Pear", "Plum", "Apricot", "Cantaloupe",
            "Pomegranate", "Blackberry", "Fig", "Date", "Dragonfruit", "Passionfruit", "Guava", "Lychee", "Tangerine", "Nectarine",
            "Coconut", "Cranberry", "Jackfruit", "Starfruit", "Mandarin", "Mulberry", "Gooseberry", "Elderberry", "Persimmon", "Soursop",
            "Clementine", "Rhubarb", "Durian", "Longan", "Marula", "Breadfruit", "Acai", "Salak", "Jambolan", "Tamarind",
            "Bing Cherry", "Avocado", "Fuyu Persimmon", "Sugar Apple", "Black Sapote", "Mamey", "Chayote", "White Currant", "Red Currant", "Kumquat",
            "Feijoa", "Sapodilla", "Jujube", "Mango Steen", "Soursop", "Barbadine", "Tamarillo", "Pluot", "Pawpaw", "Rose Apple",
            "Bittermelon", "Horned Melon", "Custard Apple", "Chilean Wineberry", "Yunnan Hackberry", "Ramanas", "Cempedak", "Miracle Fruit", "Taro", "Nance",
            "Litchi", "Indian Fig", "Chico", "Rambutan", "Jabuticaba", "Red Banana", "Santol", "Pitanga", "Ziziphus", "Carambola",
            "Pineberry", "Jamaican Cherry", "Raisin", "Goji Berry", "Kiwano", "Acerola", "Mamey Sapote", "Chirimoya", "Pomelo", "Clementine",
            "Chokecherry", "Noni", "Bacaba", "White Sapote", "Myrica", "Tamarindus", "Loquat", "Black Mulberry", "Indian Gooseberry", "Sour Cherry",
            "Yunnan Pomegranate", "Star Apple", "Mango Passionfruit", "Pandan", "Sage Fruit", "Cloudberry", "Marang", "Pineapple Guava", "Satsuma", "Langsat"
        };
        
        return fruits[fruit];
    }

        public String PersonPicker(){

            Random rand = new Random();
            int name = rand.nextInt(100);

            
            String[] names = {
                "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Henry", "Ivy", "Jack",
                "Kelly", "Liam", "Mia", "Noah", "Olivia", "Peter", "Quinn", "Ryan", "Sophia", "Thomas",
                "Ursula", "Victor", "Willow", "Xavier", "Yara", "Arnaldo", "Abigail", "Benjamin", "Chloe", "Daniel",
                "Ella", "Finn", "Gemma", "Harrison", "Isla", "Jacob", "Lily", "Mason", "Nora", "Owen",
                "Penelope", "Caleb", "Hazel", "Elijah", "Scarlett", "William", "Avery", "James", "Harper", "Logan",
                "Amelia", "Ethan", "Elizabeth", "Michael", "Victoria", "Alexander", "Emily", "Samuel", "Madison", "Joseph",
                "Grace", "Matthew", "Addison", "Daniel", "Zoey", "Christopher", "Riley", "Andrew", "Natalie", "Joshua",
                "Brooklyn", "David", "Leah", "John", "Hannah", "Ryan", "Sarah", "Brandon", "Ashley", "Kevin",
                "Gabriella", "Justin", "Alexis", "Tyler", "Samantha", "Brian", "Kayla", "Adam", "Jessica", "Cameron",
                "Taylor", "Kyle", "Lauren", "Eric", "Sydney", "Jordan", "Nicole", "Dylan", "Olivia", "Nathan"
        };

        return names[name];
    }

    public String JobPicker(){
            
            Random rand = new Random();
            int job = rand.nextInt(100);

            String[] jobs = {
                "Software Engineer", "Data Scientist", "Project Manager", "Marketing Manager", "Sales Representative",
                "Financial Analyst", "Human Resources Manager", "Customer Service Representative", "Web Developer", "Graphic Designer",
                "Network Administrator", "Database Administrator", "Business Analyst", "Technical Writer", "UX Designer",
                "UI Designer", "Quality Assurance Engineer", "DevOps Engineer", "Security Analyst", "Product Manager",
                "Accountant", "Auditor", "Legal Counsel", "Research Scientist", "Teacher",
                "Professor", "Doctor", "Nurse", "Pharmacist", "Physical Therapist",
                "Occupational Therapist", "Speech-Language Pathologist", "Medical Assistant", "Dental Hygienist", "Veterinarian",
                "Chef", "Restaurant Manager", "Bartender", "Waiter/Waitress", "Event Planner",
                "Real Estate Agent", "Insurance Agent", "Loan Officer", "Financial Advisor", "Investment Banker",
                "Public Relations Specialist", "Social Media Manager", "Content Writer", "Editor", "Journalist",
                "Photographer", "Videographer", "Animator", "Illustrator", "Fashion Designer",
                "Interior Designer", "Architect", "Civil Engineer", "Electrical Engineer", "Mechanical Engineer",
                "Chemical Engineer", "Aerospace Engineer", "Manufacturing Engineer", "Industrial Engineer", "Environmental Engineer",
                "Supply Chain Manager", "Logistics Coordinator", "Purchasing Agent", "Operations Manager", "General Manager",
                "CEO", "CTO", "CFO", "CMO", "COO",
                "Administrative Assistant", "Executive Assistant", "Receptionist", "Data Entry Clerk", "Office Manager",
                "IT Support Specialist", "Help Desk Technician", "Systems Administrator", "Cloud Engineer", "AI/ML Engineer",
                "Machine Learning Scientist", "Robotics Engineer", "Biomedical Engineer", "Biotechnologist", "Astronomer",
                "Physicist", "Chemist", "Biologist", "Geologist", "Meteorologist"
        };

        return jobs[job];
    }


    public String ColorPicker(){

        Random rand = new Random();
        int color = rand.nextInt(100);

        String[] colors = {
            "Red", "Green", "Blue", "Yellow", "Orange",
            "Purple", "Pink", "Brown", "Black", "White",
            "Gray", "Silver", "Gold", "Teal", "Cyan",
            "Magenta", "Lime", "Olive", "Maroon", "Navy",
            "Indigo", "Violet", "Turquoise", "Salmon", "Coral",
            "Beige", "Lavender", "Tan", "Mustard", "Burgundy",
            "Sky Blue", "Forest Green", "Dark Blue", "Light Yellow", "Peach",
            "Lilac", "Khaki", "Rust", "Bronze", "Charcoal",
            "Slate Gray", "Crimson", "Emerald", "Amber", "Sapphire",
            "Periwinkle", "Mauve", "Plum", "Rose", "Sea Green",
            "Mint Green", "Olive Drab", "Powder Blue", "Chocolate", "Copper",
            "Fuchsia", "Goldenrod", "Hot Pink", "Indian Red", "Ivory",
            "Jade", "Lemon Yellow", "Light Blue", "Light Coral", "Light Green",
            "Light Pink", "Medium Blue", "Medium Green", "Medium Purple", "Midnight Blue",
            "Misty Rose", "Moccasin", "Old Lace", "Orange Red", "Orchid",
            "Pale Goldenrod", "Pale Green", "Pale Turquoise", "Papaya Whip", "Peru",
            "Rosy Brown", "Royal Blue", "Saddle Brown", "Sandy Brown", "Scarlet",
            "Sienna", "Snow", "Spring Green", "Steel Blue", "Tomato",
            "Violet Red", "Wheat", "White Smoke", "Yellow Green"
    };

      return colors[color];
    
    }

    public String mathproblem(){

        Random rand = new Random();

        int numbero = rand.nextInt(100);
        int numbert = rand.nextInt(100);
        int operator = rand.nextInt(5);
        int result = 0;

        switch (operator) {
            case 0:
           result = numbero + numbert; 
                
            break;
            case 1:
            result = numbero - numbert;

            break;

            case 2:
            result = numbero * numbert;
            break;

            case 3:

            if (numbero > numbert) {
                result = numbero / numbert;
            }
            else{
                result = numbert / numbero;
            }
            

        
            break;
            
            case 4:

            if (numbero > numbert) {
                result = numbero / numbert;
            }
            else{
                result = numbert / numbero;
            }
            
            break;
        }


        
    }
}
