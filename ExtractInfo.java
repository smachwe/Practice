package com.ds;

import java.util.*;

public class ExtractInfo {

	public static void main(String[] args) {
		String[] arr = {"a1yym2 sv869t",
				"q82h42 iajidp",
				"a9sfws idjgbk",
				"q8wh2h 7weexx",
				"w259zr oeg7ny",
				"mfreaa k3v1z3",
				"fdi9se 2buyuc",
				"yk1tnw hb1krp",
				"8rzk7s usswr1",
				"82htc5 edg8u8",
				"fszziq tnf70d",
				"xy4m67 edwseg",
				"bt94tr oihmkx",
				"cupwpn t3x11z",
				"61fio3 7cir7z",
				"64wjow 0qis4l",
				"78lq2c wdcgis",
				"hpf3dt q6kwda",
				"lwyuws g9097q",
				"8fbjrg i7cb1g",
				"h99ceu 8kntrk",
				"luqfzg nhao62",
				"2sb0pt xk6479",
				"31zjug rkzdbs",
				"7jpkll mbnyz1",
				"sve1ay a7anzk",
				"nf7c5e ao21gj",
				"7czoow o5hsga",
				"82oa11 61lci6",
				"0hj90e 1hzqr3",
				"9pfogm 0csllr",
				"q1n2d8 2xey3u",
				"0sgmuz 615ub2",
				"gv4cm9 xq77n1",
				"7a5sos 85qz0r",
				"pbra86 xrbghs",
				"g6gett 9mc4a2",
				"tdfl7h in2xts",
				"3k66b5 rizpt5",
				"zg82g6 s034d9",
				"sp5fye 0i9vmf",
				"qhtg3u 6zkwmf",
				"pdavqr 5jlnrn",
				"oeooyk hqapko",
				"d4sg5p aqk2f1",
				"8c7lg5 eyv2v3",
				"32u7ch mtl5te",
				"ruo9gf 5w9o36",
				"en3dam 6cn2ky",
				"cxp4ty 035xfo",
				"0f6uwx 2xuonn",
				"biuyas kzussd",
				"ezvgt5 46ob67",
				"p9pkss 12lpix",
				"l4q9yk 4lnd58",
				"lsst12 lp0pse",
				"l0yuz4 0nod0u",
				"gju7ok kvj9v4",
				"7ohalb we1phj",
				"msz0qm a5km29",
				"qbfl93 e3pswi",
				"pfnalo cnb8tb",
				"ff6fdc xb1yox",
				"gsj9mm r0ue1t",
				"0okv1x qaczpa",
				"xn5vn0 s7cngc",
				"kpxy32 o4cjhm",
				"e761cy ziyd9c",
				"e1ewiv raflka",
				"pb2whw e207pi",
				"4wui78 1my9zs",
				"zwjqoj pwd7gw",
				"o1obl6 rx7ewz",
				"f2st6w 4a3d0s",
				"a2bhl5 3rdy4t",
				"3i1z6z mxyz9d",
				"mh00lb f86ykc",
				"p4allq 7z8q00",
				"afzvng 2mqly3",
				"f7ntmz leg553",
				"s97k32 skve0h",
				"ip01gy mgv74t",
				"hi3u47 5axgqs",
				"iu8ikp pkzeqz",
				"2bdon4 0vstid",
				"j3mmsj 5o382h",
				"wjv1un rnv67t",
				"l1gz2n 3e3xz1",
				"dglwr3 qgn93w",
				"i5c9hn tgje6a",
				"kttqd9 dl2kkf",
				"igiuu6 810g63",
				"56w0jl ma92sw",
				"om7xs3 4qtlel",
				"wph369 fyjzpv",
				"3wswd3 b0j7ll",
				"paj9pg 187glv",
				"gogmfy 5uopwo",
				"w93tyv 3fgs4y",
				"3niyvz bysza8",
				"fl8fp3 6e5skv",
				"6ulwac dz91jl",
				"fw71ub c7vgky",
				"dwvuep 0zbzvl",
				"ifq1ms j1bxnw",
				"b70698 zejze2",
				"lzz7uh iks569",
				"3ui3um 3zh21i",
				"dna80i 726yc5",
				"2q9m6c 5kbwlt",
				"plr1gk ufnz4u",
				"p4wr8f 6srgg5",
				"kd5r5w m5z56l",
				"iug2tr 3vd1qc",
				"ep64do a536k7",
				"mrnfk3 9iadvp",
				"z19pzi u7fc2g",
				"4eegqz llytzq",
				"l9a5ob memt6h",
				"lh8vdx tvxx1m",
				"xwnfut edlkt4",
				"b66zx7 2i652x",
				"cbcigu x5hfag",
				"jhcoto 7qxuw3",
				"tnf095 5i0uvi",
				"0xj00c px0jlf",
				"9wgxco zd0t56",
				"mxl5ju iyv35w",
				"b8c3s1 iqiucx",
				"0pqut4 1nfzah",
				"zgckdx nb82pa",
				"kw0tsg am6m3s",
				"apaema h4o471",
				"b2wd0p i6x3o5",
				"dt04mj te49rz",
				"6p2kf4 kr1bgx",
				"azz17j 3n3pyp",
				"pf0ix8 7ir2uq",
				"m2l1qz lhdrij",
				"xbvi30 pnqcx4",
				"fag7zm wf9nm5",
				"jllsnm p6kefx",
				"ecp6sk 66pttj",
				"4kvq3k j89x77",
				"n8540s r2tirp",
				"pgysot laxyoj",
				"exfw2e 34qfxc",
				"31tobw i095uc",
				"8l4r3i t0ggvb",
				"7d9bjw qto4f8",
				"clctcn 4xb6oh",
				"qywmjn bxnmku",
				"3ovebx srqdbq",
				"jqcyzi 89685p",
				"4xqasd jwwqep",
				"va1q7c v4rd0t",
				"130dbs l3x40t",
				"0pnl58 xxspn0",
				"e8plt9 utsnmw",
				"kn8658 vjijel",
				"nl95i1 lh0l6r",
				"xj88al x11yr3",
				"hwm8u8 8g13o7",
				"02z5oa zqnp5h",
				"9qo3fm f6774m",
				"n0em4a po9lro",
				"3qeqf8 u9e9gh",
				"5q0ium 0f46fv",
				"lvjq04 4zwaj7",
				"26g1on ki0wkh",
				"v8unwi ezpbpn",
				"yhmjh2 lztntp",
				"f0321y gaxp46",
				"9p9acp gjgt5y",
				"h4y5f2 9nqkqg",
				"36t252 5mcuvc",
				"2yswks 3y6hfp",
				"3qquqz iaj0k7",
				"p2ke96 0yow5b",
				"s7ah9i 4b98o4",
				"eu5toi vhk8vj",
				"s0pqm2 pidy7l",
				"4uw3nc jg4q9d",
				"j81a8b rs9ovx",
				"72q0ni g0xar6",
				"x2tmo3 on13i6",
				"xjef91 fkheor",
				"ew7dqw zpk297",
				"d7inll 68f0hs",
				"r0ux7e rxtlzs",
				"f70dtl 878uuc",
				"tkpq89 4lvpmh",
				"7wjrmw 4wj12y",
				"cpub2z i7o6u4",
				"x6pfya htkkjf",
				"9nnkuo v52d6q",
				"wokmxm 18naro",
				"imujgj 8kqchc",
				"d1mq5t ddrhwk",
				"a5g5o2 5k6eph",
				"v9h5qk j1g8y1",
				"oso77b svhr2b",
				"h3uq5t id1brr",
				"if59am pjvfk8",
				"7lm1bf 861byv",
				"43p6z0 uu85o4",
				"nb2q5a ci7na7",
				"1bawd3 47a5f8",
				"2ld2xd bbwkqq",
				"7d17j3 de1t7a",
				"y7v1h9 m6dnpj",
				"k9lv52 mvzboa",
				"s5bjfn 42ykak",
				"9es354 iw1ibb",
				"b58kt6 dk2voq",
				"0x7rmm unjqot",
				"duj6xe bwerpy",
				"lr68n7 vaihei",
				"km6smz uo230i",
				"rqjko2 qkzpyy",
				"xqp9qd ycskfo",
				"sen3f7 oe25eg",
				"3egenn b4ge0o",
				"9bgsdq qbvfdz",
				"vvzald gs4fvq",
				"hswpbe 6032cx",
				"8ykola qfm4r6",
				"6d29f4 h0tx05",
				"33e8en s0fvlf",
				"4i9280 go41a5",
				"8igy8q 3oyvbn",
				"af281t mxpptz",
				"qlda60 ptn2wi",
				"qnw0y5 u05bgj",
				"qpjifh 1o9kfc",
				"ktsdpv 4w1f6y",
				"4ps5xk ksa3c2",
				"lzts0h qdcsy0",
				"4oiy8w v6gf5w",
				"27tsns giva0v",
				"1chita 4ep59c",
				"5s60u0 zjs247",
				"iw9jh5 at60ha",
				"jer7ew rv58ja",
				"wf0iak uumcoh",
				"zfee56 yiqaa3",
				"ifw30n 2kmtmb",
				"b985s4 871g5a",
				"e4n3e5 pru2z3",
				"g3c5pg xya6ww",
				"nqui7j ctnf00",
				"ul8j0m rrhuys",
				"oniyx8 47vrow",
				"jv7r3e sfow4c",
				"58dg92 xh4ang",
				"ylz3hc fdxie1",
				"bjzdab fgtbct",
				"dfw8zt m5zpgs",
				"w5kxqa dleyr8",
				"7wu083 x4rqzi",
				"vdc9i0 352g7i",
				"v9xk1v f5yotm",
				"klsakw ueclk4",
				"kyxm3a b81897",
				"2fg6vn qa9vd6",
				"7eecd7 jnlvqq",
				"qhkitl x4kdmx",
				"pcrvfo n0ngxi",
				"8qhkxq gwn0gj",
				"a911lt 00k1zk",
				"m0rt6i 2p6fhb",
				"gp3hp8 cvjdlr",
				"t5wcck xcp15i",
				"xz57rw 1kepiv",
				"cm5yv9 x6jhcr",
				"d08lmj n8419v",
				"umeevi rrtq1j",
				"oxq441 9d77x7",
				"si52zh 00prq2",
				"af7lk4 8eg8qb",
				"atx4h7 t4k438",
				"dq22hh 0qluti",
				"sa0p2z oz82nc",
				"ogdrwc aqlbhp",
				"6cax7p 39l75t",
				"tt1t48 06d0ro",
				"o9wer8 q46arh",
				"z25xb8 estpuv",
				"6vpqid tx8coa",
				"jvz2e6 yruh7j",
				"4awu6u 7z3xk3",
				"wnyyhy l71rcx",
				"fone1v fzdu0a",
				"d7xvla 0trty4",
				"ionjc8 tmd5n4",
				"0po3gr e6hj63",
				"7daczh ecn712",
				"6qyvf8 ul6wei",
				"chnqla cj3j18",
				"sso0sy 7bclna",
				"04sxgw a6q6fy",
				"la2so3 ypit3i",
				"oud0h9 hagwsm",
				"igeqdq vl5xcg",
				"swpmda mrzxrp",
				"kzyi8k r2mmkk",
				"x1zis0 ia49tw",
				"htu5if qkpm9k",
				"vdouqo zxr93p",
				"8n2ktj xslb0y",
				"ches5g 38b7x9",
				"2vr8yo tjrabp",
				"w5el8c g8papt",
				"leg8bk jze8xs",
				"nf5vi1 7lu4g1",
				"2oxkym 0eggnw",
				"5t61u4 nf6yqq",
				"tvk54g 3okyut",
				"mmeodq lxt4lz",
				"65b16f wg5k9q",
				"3w0q5j hba0le",
				"n4s1n3 czkig8",
				"xklkjj uzz7dh",
				"tzsolb idop41",
				"65xklt inksjf",
				"ao8q4u 6bv7mt",
				"wgtxuy up9bd5",
				"h6xqv1 c9heh0",
				"t57c78 zjmx0d",
				"mv0vbi ssjd6f",
				"0awokb 7k72bx",
				"3soov0 4tgb1i",
				"3x3rl3 iyfpwq",
				"a0thlo qlzrvi",
				"59vq1w 8ui0i3",
				"ycd44x sb09q6",
				"e2d6to i4gios",
				"i1zwqx 5gd8d3",
				"585ibu 2gi6cx",
				"ztoxbo v7asb3",
				"e03uof dzrq4g",
				"mhyu9b g1al0y",
				"qhv9of y2jy3n",
				"xr13zu a9k3az",
				"xnxv4j p5pxxf",
				"wby2gu x035n8",
				"ps5nmd jv924p",
				"cc127p d42iba",
				"7jywpq r31q3s",
				"cqrjt3 277fan",
				"5sff0h f2klqd",
				"n0lv93 ooylhl",
				"0pcoty sp9aq5",
				"ugzwfe pn1o4b",
				"asyfo6 tms345",
				"dv2ukw q2tr1k",
				"3sivkg f1hyno",
				"7bv41a 4x78t5",
				"450f46 h3xeeh",
				"4xcni3 9zzr1u",
				"8rssgy 5ay5xp",
				"7nmk2h xkczio",
				"gbk02k qolkuw",
				"eoa895 r18x8j",
				"09e9hm tsvu5e",
				"a9j3lm cv75vp",
				"qaqzub c9yb3r",
				"w6mlcd c0cx3y",
				"zv4dfc 5b49f8",
				"jtidju 6uf6j9",
				"q74f2s ja5uy4",
				"5a4xbl y5xun1",
				"c3i81m auex7b",
				"egm1vb q9iuan",
				"j7i0i4 08yti7",
				"xk30n5 x6v4vu",
				"gq8xhm spjl5q",
				"0ofgse 5qsavz",
				"0dzv9f fewcka",
				"39p8x1 5sxtt3",
				"zqaw7x hu2r2m",
				"ppoaqo yqjqyh",
				"bfhjvl 45en6j",
				"rthcu4 4dml9d",
				"v3pxll lr2w67",
				"ohawd1 co8adn",
				"dfcebj aqmvlc",
				"rwwdqh dxyakt",
				"lpx4ho jxlxl2",
				"8um8s3 6fneef",
				"m28dux 8i0rdy",
				"neeka2 unkr0b",
				"1422s3 40pozu",
				"56md79 kgsd7e",
				"0lmnge 237j8b",
				"pdfjh4 tfcoxt",
				"bzprj2 8m7nae",
				"tjcnrs 61gzau",
				"jtk0un 9yw06n",
				"3i2vvi ucta5w",
				"mgvtzr owl3x4",
				"x3rs7w r6fnxj",
				"33xota f9o4j6",
				"jjqmyr cmv6f3",
				"gvgxj3 ypnc1u",
				"0k18ob z0l2jc",
				"frghy5 majugu",
				"q2vhtz jv6sbl",
				"mmbsnq urj3u6",
				"wuiv7d m012a4",
				"svdfta pefjcv",
				"umhxes 3ujcqx",
				"apk2x0 aythvd",
				"6dkyqn 3ai1s4",
				"t7ji2a qoqd8e",
				"0v5knk oa6eqh",
				"42t9mp hiwrac",
				"9fmgae umg0e9",
				"y1u6od 7n4x52",
				"5mt52f ei0t8h",
				"j74ilk ay4hvf",
				"5e99ar gansdf",
				"f7pws7 jow8z0",
				"y9yi7s bvndss",
				"8rdju7 ctftwr",
				"d4ojdw ds3g1g",
				"24fqut uryq7b",
				"ji7ovv ujnkdz",
				"47mmw0 4gf0nj",
				"qzfy9b 9iwu83",
				"a1pvo1 ew2sm6",
				"d5nitr bj646f",
				"5na2e9 ntlt3g",
				"bcjy9a sp0i0e",
				"6j3ygh anylm1",
				"dgj142 cpv5o3",
				"johrg7 vxykxy",
				"jktyfp x705pi",
				"p908as uuff6m",
				"f78d2i reqlup",
				"7b3wm7 j6qnmd",
				"7cs8ji fnjok8",
				"pmlw19 hygzv2",
				"cr15m1 as9b6q",
				"jtgi4m 788f4o",
				"4lvise h3zvgu",
				"qlv814 fxgs9q",
				"uktead 1bmkia",
				"ezzuni fhxamj",
				"eaa2hc qv1gtu",
				"y5hhws c9jfmu",
				"rniswt aj39sb",
				"j98nsw ncc2u6",
				"vakaic 3thwbr",
				"7ogo1n 3hpwnj",
				"9lttnz fc03qq",
				"51v9vf kuzm9l",
				"5tdhn0 xl3j0f",
				"57zhzw iuoygj",
				"y512k9 68hf5p",
				"qemlrq 78yvql",
				"25g9jb 70bhng",
				"oo1mt0 7b0n2a",
				"4ucm0t ev8p6e",
				"1akq59 6rkopl",
				"e4eixw klyev3",
				"uk0kpk jmv4nj",
				"eu7ans rsekdd",
				"tml2oj s6lkfn",
				"vlku67 rg0rut",
				"tqj1vq cmxw9z",
				"60l21u ehd8jl"};
		
		Map<String, PriorityQueue<String>> m = new HashMap<String, PriorityQueue<String>>(arr.length);
		
		for(String in: arr){
			String k = in.substring(0, in.indexOf(" "));
			String v = in.substring(in.indexOf(" ") + 1, in.length());
			
			if(m.containsKey(k)) 
				m.get(k).add(v);
			else {
				PriorityQueue<String> p = new PriorityQueue<String>(Collections.reverseOrder());
				p.add(v);
				m.put(k, p);
			}
		}
		
		
		String[] op = new String[m.size()];
		int i = 0;
		for (Map.Entry<String, PriorityQueue<String>> entry: m.entrySet()) {			
			String k = entry.getKey();
			String top = entry.getValue().peek();
			int count = entry.getValue().size();
			op[i++] = k + ":" + count + "," + top;
		}
		
		i=1;
		for(String o: op)
		System.out.println((i++)+"=" + o);
		
	}

}
