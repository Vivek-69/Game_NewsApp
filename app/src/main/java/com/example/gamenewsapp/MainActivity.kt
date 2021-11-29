package com.example.gamenewsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageList = listOf<Image>(
            Image(
                R.drawable.a,
                "Australia wins their maiden T20 World Cup title",
                "Australia won their maiden T20 World Cup title as they defeated New Zealand in the final by 8 wickets. A target of 173 in a global final is never easy but Marsh with his power and reach made it look like a walk in the park in the company of David Warner (53 off 38 balls), who also turned the wheels of fortune for himself and his team during a victory, achieved in 18.5 overs. Mitchell Marsh was named as the player of the match.\n" +
                        "\n" +


                        "Let’s have a look at the country-wise T20 World Cup winners list from 2007 to 2021:\n" +
                        "\n" +
                        "Country Name\t       No. of times          Winner\tYear\n" +
                        "West Indies\t            2\t                 2012, 2016\n" +
                        "India\t \t  \t               1\t                   2007\n" +
                        "Pakistan\t  \t             1\t                   2009\n" +
                        "England\t     \t           1\t                   2010\n" +
                        "Sri Lanka\t              1\t                   2014\n" +
                        "Australia\t              1\t                   2021"
            ),
            Image(
                R.drawable.b,
                "Mitrabha Guha named as India’s 72nd Grandmaster",
                "International Master (IM) Mitrabha Guha from Kolkata, West Bengal has become the 72nd Grandmaster of India after securing his 3rd and final Grandmaster (GM) norm at GM Third Saturday Mix 220, Novi Sad, Serbia. He won this 3rd GM norm against GM Nikola Sedlak of Mitrabha Guha scored his 2nd GM norm at the Sheikh Russel International GM Tournament 2021, Bangladesh.\n" +
                        "\n" +
                        "\n" +
                        "Recent Indian Chess Grandmasters:\n" +
                        "\n" +
                        "69th: Harshit Raja (Maharashtra)\n" +
                        "70th: Raja Rithvik (Telangana)\n" +
                        "71st: Sankalp Gupta (Maharashtra)"
            ),
            Image(
                R.drawable.c,
                "India’s first National Yogasana Sports Championships setup in Bhubaneswar",
                "India’s first Physical National Yogasana Championships has been organised in Bhubaneswar, Odisha from November 11-13, 2021. The National Yogasana Sports Championships 2021-22 has been organised by the National Yogasana Sports Federation (NYSF) in association with the Odisha state.\n" +
                        "\n" +
                        "\n" +
                        "Around 560 young Yogasana Sports athletes from across 30 states would are taking part in the event. The event aims to promote yoga and create a global brand around it, portraying it as a competitive sport with high standards and benchmarks."
            ),
            Image(
                R.drawable.d,
                "Novak Djokovic won 37th Masters Title at Paris 2021",
                "Novak Djokovic (Serbia) has defeated Danill Medvedev (Russia) in the finals to win his 6th Paris Title & the record 37th Masters Title at Paris, France. In the finals, Djokovic, with an impressive 4-6, 6-3, 6-3 defeating Daniil Medvedev. With this win, Djokovic will remain at the ATP World Number 1 rank, for the record 7th consecutive year.\n" +
                        "\n" +

                        "Important takeaways for all competitive exams:\n" +
                        "\n" +
                        "International Tennis Federation President: David Haggerty;\n" +
                        "International Tennis Federation Headquarters: London, United Kingdom;\n" +
                        "International Tennis Federation Founded: 1 March 1913."
            ),
            Image(
                R.drawable.e,
                "Dwayne Bravo announced retirement from international cricket",
                "Trinidadian cricketer Dwayne Bravo, the former captain of the West Indies cricket team has confirmed his retirement from international cricket. He has played in all seven T20 World Cups and he has been a part of the West Indies team that won the T20 Title in 2012 and 2016. He has scored 1245 runs at an average of 22.23 and a strike rate of 115.38 and he has picked up 78 wickets."
            ),
            Image(
                R.drawable.f,
                "India bags 5 medals at inaugural ISSF President’s Cup",
                "India finished the inaugural ISSF President’s Cup with five medals, including two Gold, two Silver and one Bronze. The invitation-only tournament was held at the Wroclaw in Poland, featuring the top-12 shooters in each of the shotgun, pistol and rifle categories. India’s Manu Bhaker bagged two gold medals.\n" +
                        "\n" +
                        "Medal Winners include:\n" +
                        "\n" +
                        "Gold\n" +
                        "\n" +
                        "25m Rapid Fire pistol Mixed Team competition: Manu Bhaker\n" +
                        "10m air pistol mixed team competition: Manu Bhaker\n" +
                        "\n" +
                        "Silver\n" +
                        "\n" +
                        "Women’s 25m pistol silver individual competition: Rahi Sarnobat\n" +
                        "Men’s 10m Air Pistol individual competition: Saurabh Chaudhary\n" +
                        "\n" +
                        "Bronze\n" +
                        "\n" +
                        "Men’s 10m Air Pistol individual competition: Abhishek Verma"
            ),
            Image(
                R.drawable.g,
                "Rohit Sharma becomes 3rd cricketer to score 3,000 runs in men’s T20Is",
                "Indian batter Rohit Sharma has completed 3000 T20I runs and became the third cricketer in the world to achieve this feat. Rohit reached the 3000 run mark in the ICC men’s T20 World Cup match against Namibia. Virat Kohli is at the top of the tally with 3227 runs, which is followed by New Zealand’s Martin Guptill & India’s Rohit Sharma with 3115 and 3008 runs respectively."
            ),
            Image(
                R.drawable.h,
                "ICC Players of the Month for October revealed",
                "Pakistan’s Asif Ali and Ireland’s Laura Delany have been voted the ICC Players of the Month for October. Ali beat Bangladesh’s Shakib Al Hasan and Namibia’s David Wiese to the men’s award, and Delany beat teammate Gaby Lewis and Zimbabwe’s Mary-Anne Musonda to the women’s prize.\n" +
                        "\n" +
                        "Ali scored 52 runs without defeat across three matches for Pakistan in October at the ICC Men’s T20 World Cup, scoring at a strike rate of 273.68. Ireland captain Delany shone in their 3-1 ODI series win over Zimbabwe. The all-rounder flourished with bat and ball, scoring 189 runs at 63, and taking four wickets at 27.\n" +
                        "\n" +
                        "About the award:\n" +
                        "\n" +
                        "The International Cricket Council (ICC) presents the ICC Player of the Month to recognise male and female cricketers who have best performed across all forms of international cricket in a particular month."
            ),
            Image(
                R.drawable.i,
                "Sankalp Gupta becomes 71st Indian Grandmaster",
                "Sankalp Gupta has become India’s 71st Grandmaster by scoring 6.5 points and finishing second in the GM Ask 3 round-robin event in Arandjelovac, Serbia. The Maharashtra player also touched the 2500 Elo rating mark during the tournament. To achieve the GM title, a player has to secure three GM norms and cross the live rating of 2,500 Elo points."
            ),
            Image(
                R.drawable.j,
                "India’s Tajamul Islam Wins Gold Medal In World Kickboxing Championship",
                "13-year-old Tajamul Islam is the first Kashmiri girl to have represented India and won the gold medal in the under-14 age category in World Kickboxing Championship held at Cairo in Egypt. Islam defeated Argentina’s Lalina in the final. She was born in Tarkpora, a remote village in north Kashmir’s Bandipora district. Tajamul is also a brand ambassador of the Beti Bachao Beti Padhao (BBBP) scheme."
            ),
            Image(
                R.drawable.k,
                "Manika Batra & Archana Kamath clinches WTT Contender Table Tennis Tournament",
                "In Table Tennis, Indian duo Manika Batra and Archana Girish Kamath clinched the women’s doubles title in the WTT Contender tournament in Lasko, Slovenia. The Indian pair defeated the Puerto Rican team of Melanie Diaz and Adriana Diaz, 11-3, 11-8, 12-10 to win the title. Meanwhile, Manika Batra also claimed a bronze medal in the women’s singles title after Wang Yidi of China defeated her by 2-4 (11-7, 7-11, 13-11, 10-12, 11-7, 11-5)."
            ),
            Image(
                R.drawable.l,
                "Max Verstappen wins 2021 Mexico City Grand Prix",
                "Max Verstappen (Red Bull – Netherlands) has won the 2021 Mexico City Grand Prix held at the Autódromo Hermanos Rodríguez in Mexico City. Seven-times world champion Lewis Hamilton (Mercedes-Great Britain) stood second while Sergio Perez (Mexico- Red Bull) came third. Perez became the first Mexican to stand on his home podium at a jubilant Autodromo Hermanos Rodriguez."
            ),
            Image(
                R.drawable.m,
                "TCS becomes Jaguar’s Formula E title partner",
                "Tata Consultancy Services (TCS) has joined British racing team Jaguar Racing as the title partner, ahead of the 2021/22 ABB FIA Formula E World Championship. The team will be known as Jaguar TCS Racing. TCS and Jaguar will create a dynamic platform that will drive research and innovation while steering towards advanced concepts and electric vehicle (EV) technologies.\n" +
                        "\n" +
                        "The rebranding of the team also brings an all-new livery for 2022. The team heads into Season 8 on the back of its most successful Formula E campaign. Together with drivers Mitch Evans and Sam Bird, Jaguar was second overall in the 2021 Formula E World Championship."
            ),
            Image(
                R.drawable.n,
                "Manu Bhaker and Javad Foroughi wins gold in inaugural President’s Cup",
                "India’s woman pistol star Manu Bhaker and Iranian Olympic champion Javad Foroughi has won the 10m air pistol mixed team gold at the inaugural ISSF President’s Cup at the Wroclaw in Poland. The Indo-Iranian pair beat the French-Russian duo of Mathilde Lamolle and Artem Chernousov 16-8 to clinch the gold medal. A seven-member Indian contingent is participating in the ISSF President’s Cup."
            ),
            Image(
                R.drawable.o,
                "Akash Kumar settles for bronze in 2021 AIBA Men’s World Championships",
                "Indian boxer Akash Kumar managed to clinch the bronze medal at the 2021 AIBA Men’s World Boxing Championships on November 05, 2021 at Belgrade in Serbia. The 21-year-old Akash lost 0-5 in the 54 kg category to Makhmud Sabyrkhan of Kazakhstan. Akash is the seventh Indian male boxer to win a medal at the world championships."
            ),
            Image(
                R.drawable.p,
                "Unmukt Chand becomes the 1st Indian male to sign up for BBL",
                "Unmukt Chand has become the first Indian male cricketer to sign up for the Big Bash League as he is set to feature in the Melbourne Renegades side in the upcoming edition. The 28-year-old, who led India to the Under-19 World Cup title in 2012, has represented India A, apart from featuring in teams like Delhi Daredevils, Mumbai Indians, and Rajasthan Royals in the IPL. He announced his retirement from Indian cricket in August this year stating that he would explore ‘better opportunities from around the world’.\n" +
                        "\n" +
                        "Chand has now shifted his base to the United States of America (USA). He was recently named ‘Player of the Tournament as his side, Silicon Valley Strikers, won the Minor League Cricket (MCL) title. The right-handed batter will travel to Australia later this month and be available for the entire duration of the tournament."
            ),
            Image(
                R.drawable.q,
                "Indian GM P Iniyan won Rujna Zora chess tournament",
                "Indian Grandmaster (GM) P Iniyan has won the 5th Rujna Zora chess tournament held at Serbia. International Master (IM) Makarian Rudik of Russia finished 2nd and another Indian Player V S Raaghul finished 3rd and IM S. Nitin placed 4th. P Iniyan is the 16th Indian Grand Master from Erode, Tamil Nadu. His current International Chess Federation (FIDE) ratings is 2556.\n" +
                        "\n" +
                        "Important takeaways for all competitive exams:\n" +
                        "\n" +
                        "International Chess Federation (FIDE) Founded: 1924 in Paris, France;\n" +
                        "International Chess Federation (FIDE) Headquarters: Lausanne, Switzerland;\n" +
                        "International Chess Federation (FIDE) President: Arkady Dvorkovich"
            ),
            Image(
                R.drawable.r,
                "J&K team clinch 1st position in World Deaf Judo Championship",
                "The Jammu & Kashmir team for deaf clinched 1st position in World Deaf Judo Championship held at Paris Versailles, France. Rakshanda Mehak who is part of the Indian team for the deaf clinched the bronze medal by defeating the South Korean team in the semifinal. The championship was held at Versailles, France. The championship is organised by the International Committee of Sports for the Deaf.\n" +
                        "\n" +
                        "Important takeaways for all competitive exams:\n" +
                        "\n" +
                        "International Committee of Sports for the Deaf Founded: 1924;\n" +
                        "International Committee of Sports for the Deaf President: Rebecca Adam."
            ),
            Image(
                R.drawable.s,
                "Harbhajan Singh & Javagal Srinath awarded MCC life membership",
                "The Marylebone Cricket Club (MCC) has released the list of 18 Cricketers who were selected for the MCC awards Honorary Life Membership of the Club. The list witnessed the names of 2 former Indian cricketers – Harbhajan Singh and Javagal Srinath. This year’s list saw the names of 18 players, including 16 Male & 2 Female players (Sarah Taylor & Sara McGlashan).\n" +
                        "\n" +
                        "Important takeaways for all competitive exams:\n" +
                        "\n" +
                        "Melbourne Cricket Club Founded: 1838;\n" +
                        "Melbourne Cricket Club Location: Melbourne, Australia;\n" +
                        "Melbourne Cricket Club President: Clare Connor (1st Female President of MCC)."
            ),
            Image(
                R.drawable.t,
                "Netherland’s Ryan ten Doeschate retired from International Cricket",
                "Ryan ten Doeschate, the 41-year-old Cricket all-rounder from the Netherlands, announced retirement from International Cricket after Netherland failed to qualify for the Super 12 stage of the International Cricket Council (ICC) T20 World Cup. During the qualifiers, Netherland lost to Namibia and failed to enter the Super 12 stage, which was his last international match.\n" +
                        "\n" +
                        "Ryan ten Doeschate has scored 2074 runs from 57 international Test matches, 1541 runs from 33 One Day Internationals & 533 runs from 24 T20 internationals, since his debut in 2006."
            ),
            Image(
                R.drawable.u,
                "Viktor Axelsen and Akane Yamaguchi won Denmark Open 2021",
                "Danish Olympic champion Viktor Axelsen won the Mens’ single 2021 Denmark Open Badminton held at the Odense Sports Park, Denmark. He defeated world number one Kento Momota of Japan. Akane Yamaguchi of Japan won her second title in the women’s category defeating An Se-young (South Korea).\n" +
                        "\n" +

                        "List of all winners of Denmark Open 2021:\n" +
                        "\n" +
                        "Category\tWinner\n" +
                        "Mens’ single\t-Viktor Axelsen (Denmark)\n" +
                        "Womens’ single\t-Akane Yamaguchi (Japan)\n" +
                        "Men’s double\t-Takuro Hoki, and Yugo Kobayashi (Japan)\n" +
                        "Women’s double\t-Huang Dongping and Zheng Yu (China)\n" +
                        "Mixed double\t-Yuta Watanabe and Arisa Higashino (Japan)."
            ),
            Image(
                R.drawable.v,
                "FIFA Ranking 2021: India ranked 106th",
                "India has ranked 106th in the FIFA (Fédération Internationale de Football Association) Rankings 2021, the position of team India was increased to one spot. After the victory in the SAFF (South Asian Football Federation) Championship 2021 of team India led by Sunil Chhetri, it has secured the 106th position. The team has defeated Nepal in the summit clash. Under the FIFA Rankings, Belgium is at 1st position. Brazil holds 2nd position, France holds 3rd position."
            ),
            Image(
                R.drawable.w,
                "India’s Bhavani Devi wins Charlellville National Competition in France",
                "Fencer Bhavani Devi, who made history at the Tokyo Olympics by becoming the first Indian to compete in the sport at the Games, has won the Charlellville National Competition in France in the individual women’s sabre event. She is currently ranked 50th in the world and is the top-ranked fencer from India. She is eyeing a good show at the 2022 Asian Games and has started preparing for the multi-discipline sporting extravaganza."
            ),
            Image(
                R.drawable.x,
                "Rahul Dravid appointed as Team India head coach",
                "Former Indian batter, Rahul Dravid has been appointed as Team India’s head coach and he will be succeeding Ravi Shastri, whose tenure at the helm ends after the 2021 edition of the T20 World Cup in the UAE. As per reports, BCCI president Sourav Ganguly and honorary secretary Jay Shah had a meeting with Dravid in Dubai and pleaded with him to take charge of the national team. As per reports, Dravid, also known as ‘The Wall’ of Indian cricket, has been roped in on a two-year contract and he will draw a salary of INR 10 crores.\n" +
                        "\n" +

                        "Team India has also appointed lieutenant Paras Mhambrey as their bowling coach, replacing Bharat Arun. Even as Vikram Rathour has been persisted with as the batting coach, the decision on who should replace fielding coach R Sridhar hasn’t been made just yet."
            ),
            Image(
                R.drawable.y,
                "Divya Deshmukh becomes India’s 21st Woman Grand Master",
                "15-year-old Divya Deshmukh became India’s 21st Woman Grand Master (WGM) after achieving her 2nd International Master (IM) at Grand Master (GM) in Budapest, Hungary. He scored five points in the nine rounds and ended up with a performance rating of 2452 to secure her final WGM norm.\n" +
                        "\n" +
                        "Divya also secured her second IM-norm and is now a norm away from becoming an International Master. Apart from three wins, she played out four draws while losing two games in the tournament."
            ),
            Image(
                R.drawable.z,
                "IPL 2021 won by Chennai Super Kings",
                "Chennai Super Kings (CSK) has defeated Kolkata Knight Riders (KKR) in the finals to win the 2021 Indian Premier League (IPL) title. This was the 14th edition of IPL which is an India-based Cricket league in 20-20 format. This was the 4th win of Chennai Super Kings (CSK) in IPL, having previously won the tournament in 2010, 2011, and 2018.\n" +
                        "\n" +
                        "Here are some important points from exam point of view:\n" +
                        "\n" +
                        "M.S. Dhoni is the captain of CSK the winning team.\n" +
                        "Eoin Morgan is the captain of the Runner up team i.e Kolkata Knight Riders (KKR). He is from England\n" +
                        "The first half of IPL was played in India, while the second half was played in UAE. The finals were held at Dubai International Stadium.\n" +
                        "Player of the Tournament: Harshal Patel (RCB)\n" +
                        "Highest Run Scorer (Orange Cap): Ruturaj Gaikwad (CSK) (635 runs)\n" +
                        "Highest Wicket Taker (Purple Cap): Harshal Patel (RCB) (32 wickets)\n" +
                        "Mumbai Indians team has won the IPL title highest number of times, i.e 5 times."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}

