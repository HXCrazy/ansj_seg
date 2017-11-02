package org.ansj.app.summary;

import org.ansj.app.keyword.Keyword;
import org.junit.Test;
import org.nlpcn.commons.lang.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class TagContentTest {

	@Test
	public void test() {

		String query = "信息公开 工作要点";

		String content = "国务院办公厅关于印发\n" + "2015年政府信息公开工作要点的通知\n" + "国办发〔2015〕22号\n" + "\n" + "各省、自治区、直辖市人民政府，国务院各部委、各直属机构：\n" + "　　《2015年政府信息公开工作要点》已经国务院同意，现印发给你们，请结合实际认真贯彻落实。\n"
				+ "\n" + "　　　　　　　　　　　　　　　　　　　　　　　　　　　　　国务院办公厅\n" + "　　　　　　　　　　　　　　　　　　　　　　　　　　　　　2015年4月3日\n" + "\n" + "　　（此件公开发布）\n" + "\n" + " \n" + "\n" + "2015年政府信息公开工作要点\n"
				+ "\n"
				+ "　　2015年是全面深化改革的关键之年，是全面推进依法治国的开局之年。做好今年政府信息公开工作的总体要求是：深入贯彻党的十八大和十八届二中、三中、四中全会精神，认真落实《中华人民共和国政府信息公开条例》（以下简称《条例》），紧紧围绕党和政府中心工作以及公众关切，推进重点领域信息公开，加强信息发布、解读和回应工作，强化制度机制和平台建设，不断增强政府信息公开实效，进一步提高政府公信力，使政府信息公开工作更好地服务于经济社会发展，促进法治政府、创新政府、廉洁政府和服务型政府建设。\n"
				+ "　　一、推进重点领域信息公开\n" + "　　继续做好安全生产、就业、财政审计、科技管理和项目经费、价格和收费、信用等领域信息公开，进一步扩大公开范围，细化公开内容。同时，推进以下领域信息公开工作：\n"
				+ "　　（一）推进行政权力清单公开。进一步推进国务院部门行政审批项目取消、下放以及非行政许可审批事项清理等信息的公开。推行地方各级政府工作部门权力清单制度，依法向社会公开政府部门的行政职权及其法律依据、实施主体、运行流程、监督方式等信息。对于承担的行政审批事项，均要发布服务指南，列明设定依据、申请条件、申请材料、基本流程、审批时限、收费依据及标准、审批决定证件、年检要求、注意事项等内容。除涉及国家秘密、商业秘密或个人隐私外，所有行政审批事项的受理、进展情况、结果等信息均应公开。（国务院审改办牵头落实）\n"
				+ "　　（二）推进财政资金信息公开。及时公开经批准的预算、预算调整、决算、预算执行情况报告及报表，并对财政转移支付安排、执行情况以及举借债务情况等重要事项作出说明。做好中央和地方部门预决算公开，积极推进预算绩效信息和国有资产占用情况公开。细化预决算公开内容，各级政府及部门预决算在公开到支出功能分类项级科目的基础上，一般公共预算基本支出逐步公开到经济分类款级科目，对下专项转移支付预决算公开到具体项目，并公开分地区的税收返还、一般性转移支付和专项转移支付情况。“三公”经费决算公开应细化说明因公出国（境）团组数及人数，公务用车购置数及保有量，国内公务接待的批次、人数，以及“三公”经费增减变化原因等信息。及时完整公开政府采购项目信息、采购文件、中标或成交结果、采购合同、投诉处理结果等。按照地方政府债券发行有关规定，及时准确披露相关信息。（财政部牵头落实）\n"
				+ "　　（三）推进公共资源配置信息公开。一是做好城镇保障性安居工程特别是棚户区改造建设项目信息、保障性住房分配信息公开工作。定期公开住房公积金管理运行情况，及时公开推进工程质量治理行动的进展情况。（住房城乡建设部牵头落实）二是做好土地供应计划、出让公告、成交公示和供应结果公开工作，重点公开棚户区改造用地年度供应计划、供地时序、宗地规划条件和土地使用要求。推进全国范围的征地信息公开平台建设，及时公开征地政策和征地信息。（国土资源部牵头落实）三是全面做好国有土地上房屋征收决定、补助奖励政策和标准、初步评估结果、补偿方案、补偿标准、补偿结果等公开工作。（住房城乡建设部牵头落实）\n"
				+ "　　（四）推进重大建设项目信息公开。重点围绕铁路、城市基础设施、节能环保、农林水、土地整治等涉及公共利益和民生领域的政府投资项目，推进审批、核准、备案等项目信息的公开，做好项目基本信息和招投标、重大设计变更、施工管理、合同履约、质量安全检查、资金管理、验收等项目实施信息的公开工作。（国务院相关部门分别落实）\n"
				+ "　　（五）推进公共服务信息公开。一是做好社会保险信息公开。定期向社会公开各项社会保险参保情况、待遇支付情况和水平，社会保险基金收支、结余和收益情况等信息。及时发布基本医疗保险、工伤保险和生育保险药品目录，以及基本医疗保险、工伤保险诊疗项目范围、辅助器具目录等信息。（人力资源社会保障部、卫生计生委分别落实）二是推进社会救助信息公开。重点做好城乡低保、特困人员供养、医疗救助、临时救助等信息公开工作；实行救助实施过程公开，加大救助对象人数、救助标准、补助水平和资金支出等信息公开力度。（民政部牵头落实）三是推进教育领域信息公开。全面实施高校招生“阳光工程”，推动高校重点做好录取程序、咨询及申诉渠道、重大事件违规处理结果、录取新生复查结果等信息公开工作，及时公开高校自主招生办法、考核程序和录取结果，全面实行考试加分考生资格公示工作。推动高校制定财务公开制度，加大高校财务公开力度。（教育部牵头落实）四是深化医疗卫生领域信息公开。做好法定传染病和重大突发公共卫生事件的信息公开，推动各类医疗机构健全信息公开目录，全面公开医疗服务、价格、收费等信息。（卫生计生委牵头落实）\n"
				+ "　　（六）推进国有企业信息公开。做好国有企业主要财务指标、整体运行情况、业绩考核结果等信息公开工作，加大国有资产保值增值、改革重组、负责人职务变动及招聘等信息公开力度。参照有关监督机构及上市公司监事会信息披露的做法，公开监事会对中央企业监督检查情况。研究制定国有企业财务信息公开指导意见，明确公开范围、内容、程序、工作要求等，进一步推动国有企业公开财务信息，推动各级履行出资人职责机构公开国有企业财务汇总信息。研究制定推进中央企业信息公开工作指导意见。（国资委牵头落实）\n"
				+ "　　（七）推进环境保护信息公开。进一步推进空气质量、水环境质量、污染物排放、污染源、建设项目环评等信息公开，做好环境重点监管对象名录和区域环境质量状况公开工作。加大环境执法检查依据、内容、标准、程序和结果公开力度。公开群众举报投诉重点环境问题处理情况，违法违规单位及其法定代表人名单和处理、整改情况。加强突发环境事件信息公开，及时公布应对情况及调查结果。推进核与辐射安全信息公开，重点公开核电厂核与辐射安全审批信息和辐射环境质量信息。（环境保护部牵头落实）\n"
				+ "　　（八）推进食品药品安全信息公开。做好食品药品重大监管政策信息、产生重大影响的食品药品典型案件，以及食品安全监督抽检、药品监督抽验信息公开工作。及时发布网上非法售药整治等专项行动信息和保健食品消费警示信息。（食品药品监管总局牵头落实）\n"
				+ "　　（九）推进社会组织、中介机构信息公开。加大社会组织成立、变更、注销、评估、年检结果、查处结果等信息公开力度。制定社会团体和民办非企业单位信息公开管理办法，推动服务、收费等事项公开。建立行政审批前置服务项目信息公开制度，公开提供服务的社会组织和中介机构名称、经营地址、资质状况等基本信息，以及实行政府定价或政府指导价的收费标准，方便企业和公众选择。推动慈善组织信息公开。（民政部、国务院其他有关部门分别落实）\n"
				+ "　　二、全面加强主动公开工作\n"
				+ "　　（一）进一步拓展主动公开内容。对于行政决策、执行、管理、服务、结果方面的信息，坚持以公开为常态、不公开为例外原则，依法依规做好公开工作。要对本地区本部门政府信息进行梳理，进一步细化主动公开范围和公开目录，并动态更新。对制作形成或在履行职责中获取的政府信息，严格落实公开属性源头认定机制，依法依规明确公开属性，确定为依申请公开或不予公开的，应当说明理由。涉及公民、法人或其他组织权利和义务的规范性文件，都要按《条例》规定全面、准确、及时做好公开工作。积极稳妥推进政府数据公开，鼓励和推动企业、第三方机构、个人等对公共数据进行深入分析和应用。\n"
				+ "　　（二）加大政策解读回应力度。对涉及面广、社会关注度高或专业性较强的重要政策法规，要同步制定解读方案，加强议题设置，通过发布权威解读稿件、组织专家撰写解读文章等多种方式，及时做好科学解读，有效开展舆论引导。适应网络传播特点，更多运用图片、图表、图解、视频等可视化方式，增强政策解读效果。健全政务舆情收集、研判和回应机制，对涉及本地区本部门的重要政务舆情、重大突发事件等热点问题，要依法按程序第一时间通过网上发布信息、召开新闻发布会、接受媒体采访等方式予以回应，并根据工作进展持续发布动态信息。回应力求表达准确、亲切、自然，为群众提供客观、可感、可信的信息，发挥正面引导作用。\n"
				+ "　　（三）发挥各类信息公开平台和渠道作用。统筹运用新闻发言人、政府网站、政府公报、政务微博微信发布信息，充分发挥广播电视、报刊、新闻网站、商业网站和政务服务中心的作用，扩大发布信息的受众面、提高影响力。特别要适应传播对象化分众化趋势以及新兴媒体平等交流、互动传播的特点，更好地运用新技术、新手段，注重用户体验和信息需求，扩大政府信息传播范围，提高信息到达率。加强不同平台和渠道发布信息的衔接协调，确保公开内容准确、一致。\n"
				+ "　　三、强化依申请公开管理和服务\n"
				+ "　　建立健全政府信息公开申请接收、登记、办理、审核、答复、归档等环节的制度规范。进一步拓展依申请公开受理渠道，更好地发挥互联网和各级政务服务中心的作用，为申请人提供便捷服务。强化政府信息公开场所的管理和服务，明确工作标准，做好现场解疑释惑工作。严格按照法定时限履行答复程序，制定统一规范的答复格式，推行申请答复文书的标准化文本，依法依规做好答复工作。探索建立依申请公开促进依法行政的机制，及时总结依申请公开工作中发现的依法行政方面的问题，加强跟踪调研，提出工作建议。及时梳理本单位本系统信息公开申请情况，按照申请内容、答复情况等进行分类管理，加强研究分析，促进工作水平不断提升。\n"
				+ "　　四、建立健全制度机制\n"
				+ "　　完善政府信息公开指南，各级行政机关年内要对本行政机关的公开指南进行复查，内容缺失或者更新不及时的，及时完善相关内容。做好信息公开统计工作，加强统计数据分析和运用。加强信息公开年度报告编制和发布工作，在《条例》规定基础上，进一步充实重点领域信息公开、政策解读回应、依申请公开工作详细情况、政府信息公开统计数据、建议提案办理结果公开等内容，并采用公众喜闻乐见的形式予以展现。加强信息公开保密审查制度建设，对拟公开的政府信息，要依法依规做好保密审查。建立健全政府信息公开工作考核评议制度，强化问责制度，定期开展社会调查评议，了解社情民意，不断改进公开工作。建立政府信息公开举报办理工作制度，强化信息公开工作主管部门的监督职责，对经举报查实的有关问题，要严格依据《条例》规定进行处理。地方和部门可根据工作需要在信息公开领域建立政府法律顾问制度，发挥法律顾问专业优势，提高信息公开专业化、法制化水平。\n"
				+ "　　五、加强组织领导和机构队伍建设\n"
				+ "　　各地区各部门要把政府信息公开工作纳入重要议事日程，与经济社会管理工作紧密结合，同步研究、同步部署、同步推进，主要负责同志要主动听取公开工作情况汇报，研究解决突出问题，同时明确一位负责同志分管公开工作。要理顺工作关系，减少职能交叉，加强专门机构建设和人员配备，统筹做好信息公开、政策解读、舆情处置、政府网站、政务微博微信和政府公报等工作，并在经费、设备等方面提供必要保障。把信息公开列入公务员培训科目，加大各级政府尤其是市、县级政府相关工作人员培训力度，不断提升工作能力和水平。\n"
				+ "　　各地区各部门要制定本工作要点分解细化方案，明确分工，加强督导，确保各项任务落实到位。落实情况要纳入政府信息公开工作年度报告并向社会公布，接受公众监督。国务院办公厅适时对本工作要点落实情况进行督查，并组织开展第三方评估。";

		SummaryComputer sc = new SummaryComputer(300, true, null, content);

		TagContent tc = new TagContent("<begin>", "<end>");

		String[] split = query.split(" ");

		List<Keyword> keywords = new ArrayList<Keyword>();

		for (String kw : split) {
			if (!StringUtil.isBlank(kw)) {
				keywords.add(new Keyword(kw, 100.0d * kw.length()));
			}
		}

		String tagContent = tc.tagContent(sc.toSummary(keywords));

		System.out.println(tagContent);
	}

	@Test
	public void test1() {

		String query = "信息公开 工作要点";

		String content = "信息公开,信息公开信息公开,信息公开信息公开,信息公开信息公开,信息公开信息公开,信息公开信息公开,信息公开信息公开,信息公开信息公开,信息公开?"
				+ "sdfsdfdslkfjsdklfjlsdsdfsdfdslkfjsdklfjlsdsdfsdfdslkfjsdklfjlsdsdfsdfdslkfjsdklfjlsdsdfsdfdslkfjsdklfjlsdsdfsdfdslkfjsdklfjlsdsdfsdfdslkfjsdklfjlsd?"
				+ "信息公开 工作要点 信息公开 工作要点 信息公开 工作要点 ";

		SummaryComputer sc = new SummaryComputer(15, true, null, content);

		TagContent tc = new TagContent("<begin>", "<end>");

		String[] split = query.split(" ");

		List<Keyword> keywords = new ArrayList<Keyword>();

		for (String kw : split) {
			if (!StringUtil.isBlank(kw)) {
				keywords.add(new Keyword(kw, 100.0d * kw.length()));
			}
		}
		
		System.out.println(sc.toSummary(keywords).getSummary());

		String tagContent = tc.tagContent(sc.toSummary(keywords));

		System.out.println(tagContent);
	}

	@Test
	public void test2() {

		String query = "孙明波";

		String content = "　近年来，全市广大专业技术人员认真贯彻落实党的十七大精神，坚持以邓小平理论和“三个代表”重要思想为指导，深入贯彻落实科学发展观，积极投身经济建设、政治建设、文化建设和社会建设，勤奋工作，刻苦攻关，为全市经济社会发展作出了积极贡献，涌现出一批优秀专业技术人才典型。为激发全市广大专业技术人员创新创业，市委、市政府决定，授予丁洪斌等179名同志“青岛专业技术拔尖人才”称号（名单附后），并予以表彰。　　希望受到表彰的同志珍惜荣誉，再接再厉，再创佳绩。全市广大专业技术人员要向专业技术拔尖人才学习，立足本职，开拓进取，为把青岛建设成为富强文明和谐的现代化国际城市作出新的更大贡献。各级党委政府要牢固树立、全面落实科学发展观和人才观，坚定不移地实施“科教兴市”、“人才强市”战略，不断创新人才工作机制，改善人才工作环境，为优秀人才脱颖而出和更好地发挥聪明才智搭建良好平台，为推进“环湾保护、拥湾发展”战略的实施和实现青岛经济社会又好又快发展提供坚强的人才保障和智力支持。　　　　附件：　　2008年度青岛专业技术拔尖人才名单　　（按姓氏笔画排列）　　丁洪斌　青建集团股份公司总裁、工程技术应用研究员、国家一级注册建造师　　于万成　青岛市职业教育公共实训基地教育培训部主任、中学高级教师、数控高级技师　　于良民　中国海洋大学化学化工学院教授　　于俊生　青岛市海慈医疗集团副总院长、主任医师　　于雪初　青岛波尔旺肉业股份有限公司董事长、工程师　　马学真　青岛市肿瘤医院副院长、主任医师、教授　　王　玮　青岛市广播电视局副总编辑，青岛人民广播电台副台长、高级编辑　　王亻凡玉　青岛市普通教育教研室教研员、中学高级教师　　王少华　青岛市市立医院药学部主任、主任药师　　王圣诵　青岛大学法学院院长、教授　　王竹泉　中国海洋大学文科处处长、管理学院副院长、教授　　王志庆　青岛喜盈门双驼轮胎有限公司总经理、高级经济师　　王志斌　青岛大学医学院附属医院心脏超声科主任、主任医师、教授　　王均国　青岛市衡器管理所副所长、工程技术应用研究员　　王绍波　青岛大学美术学院院长、教授　　王金健　青岛高校软控股份有限公司常务副总裁、高级工程师　　王春波　青岛大学医学院人体机能学实验室主任、教授　　王洪仁　青岛双瑞防腐防污工程有限公司总经理助理、高级工程师　　王洪恩　青岛市公安局行动技术支队副调研员、高级工程师　　王振海　中共青岛市委党校副校长、青岛行政学院副院长　　王清印　中国水产科学研究院黄海水产研究所所长、研究员　　王斌贵　中国科学院海洋研究所研究员　　王新强　青岛市机关事务局东部管理中心副总经理、高级技师　　王德宝　青岛科技大学人事处副处长、副教授　　牛同和　胶南市珠海路小学教师、中学高级教师　　牛膺筠　青岛大学医学院附属医院主任医师、教授　　尹凤福　海尔集团技术研发中心绿色设计及资源再生技术研究所所长、高级工程师　　尹衍升　中国海洋大学材料科学与工程研究院院长、教授　　尹焕三　中共青岛市委党校正处级调研员、教授　　石中年　南车青岛四方机车车辆股份有限公司技术工程部副部长、高级工程师　　石兆胜　胶南市职业中专校长、胶南市职教中心主任、青岛电大胶南分校校长、中学高级教师　　左　华　青岛市环境保护科学研究院副院长、教授级高工　　左铁军　青岛市海青机械总厂厂长、高级工程师　　史文伯　海信科龙（广东）空调有限公司总经理助理兼特种空调事业部部长、工程师　　宁　征　青岛市实验幼儿园园长、中学高级教师　　邢泉生　青岛市妇女儿童医疗保健中心儿童医院副院长、主任医师　　吉中强　青岛市海慈医疗集团总院长、主任医师、教授　　吕佩师　青岛海尔洗衣机有限公司总工程师兼全球企划部部长、高级工程师　　曲月锋　青岛市优秀运动队高级教练　　曲立清　青岛国信发展（集团）有限公司国信海底隧道项目筹建处副总经理、研究员　　曲凯先　崂山区中韩街道办事处枯桃社区党委书记、居委会主任，兼任青岛市崂山区枯桃花卉实业有限公司董事长、总经理　　朱　中　青岛海信网络科技公司副总经理、高级工程师　　朱校斌　中国科学院海洋研究所研究员　　刘　晓　中国科学院海洋研究所研究员　　刘占杰　青岛海尔特种电器有限公司本部长、研究员　　刘玉霞　中国海洋大学基础教学中心艺术系副主任、教授　　刘光洲　青岛双瑞防腐防污工程有限公司研发部部长、高级工程师　　刘怀荣　青岛大学文学院副院长、教授　　刘国庆　胶南市畜牧科技指导站研究员　　刘学斌　青岛市公安局网络警察支队支队长、高级工程师　　刘增人　青岛大学鲁迅研究中心主任、教授　　刘德进　中交一航局第二工程有限公司总工程师、高级工程师　　关茜市　南区教育研究指导中心教研员、中学高级教师　　许振超　青岛港前湾集装箱码头有限责任公司工程技术部固机高级经理、高级技师　　孙　勇　青岛大学医学院药剂教研室主任、教授　　孙大庆　青岛市林木种苗站站长、高级工程师　　孙立荣　青岛大学医学院附属医院小儿科副主任兼小儿血液科主任、主任医师、教授　　孙先亮　青岛第二中学校长、中学高级教师　　孙明波　青岛啤酒股份有限公司总裁、工程技术应用研究员　　杜长河　青岛高校信息产业有限公司总裁、高级工程师　　杨为东　青岛即发集团控股有限公司总经理兼技术中心主任、工程师　　李　平　青岛市市政工程集团有限公司总工程师兼市政设计院院长、工程技术应用研究员　　李　杨　青岛市市立医院院长、主任医师　　李　明　青岛海湾集团有限公司总经理，兼任青岛海晶化工集团有限公司董事长、总经理、高级工程师　　李　娜　青岛大学医学院附属医院耳鼻喉科主任、主任医师　　李　琪　中国海洋大学水产学院常务副院长、教授　　李　群　青岛大学应用化学系主任兼应用化学研究所所长、特聘教授　　李卫国　青岛市优秀运动队高级教练兼国家羽毛球队领队、教练　　李文华　青岛市海慈医疗集团影像科主任、主任医师　　李宁毅　青岛大学医学院附属医院主任医师、教授　　李延团　中国海洋大学医药学院副院长、教授　　李成林　山东省海水养殖研究所科研计划与管理办公室主任、副研究员　　李自普　青岛大学医学院附属医院儿科副主任、主任医师、教授　　李志刚　即墨市第二十八中学校长、中学高级教师　　李美华　胶州市振华路小学教师、小学高级教师　　李建英　青岛供电公司调度处自动化班班长、高级工程师、高级技师　　李荣贵　青岛大学医学院生物系主任、教授　　李德爱　青岛市市立医院科研科主任、主任医师　　连新国　青岛市歌舞剧院院长、国家一级导演　　肖国林　青岛海洋地质研究所海洋油气与水合物资源室副主任、研究员　　肖建林　海信集团副总裁　　吴　平　青岛市京剧院名誉院长、国家一级演员　　吴力群　青岛大学医学院外科学教研室主任兼附属医院外科主任、肝胆外科主任、主任医师　　吴乐琴　青岛第二十一中学语文教研组组长、中学高级教师　　吴时国　中国科学院海洋研究所研究员　　邹云雯　青岛大学医学院附属医院骨科主任、主任医师、教授　　沙淑芬　双星集团有限责任公司总工程师、高级工程师　　宋林生　中国科学院海洋研究所研究员　　宋瑞兰　青岛第五十八中教师、中学高级教师　　宋德强　青岛市胶州建设集团有限公司工人、高级技师　　张　博　青岛颐中生物工程有限公司董事长、总经理、高级经济师　　张七一　青岛市市立医院副院长、主任医师　　张士璀　中国海洋大学生命科学与技术学部副主任、教授　　张元信　解放军第四○一医院手外科中心副主任、副主任医师　　张化新　青岛出版社科技出版中心总编辑、编审　　张正欣　青岛饮料集团有限公司董事长、总经理，兼青岛崂山矿泉水有限公司董事长、青岛华东葡萄酿酒有限公司总经理、高级工程师　　张永升　青岛地恩地机电科技股份有限公司董事长　　张志刚　青岛东佳纺机（集团）有限公司总工程师、工程师　　张国防　青岛明月海藻集团有限公司董事长、工程师　　张国辉　青岛市供水管理处处长、工程技术应用研究员　　张荣华　中国石油大学（华东）人文社会科学学院党委书记兼副院长、教授　　张健春　青岛海信电器股份有限公司产品开发部副总经理、高级工程师　　张爱国　青岛英派斯（集团）有限公司总裁、经济师　　张铁柱　青岛大学副校长兼车辆电子技术研究所所长、教授　　张增惠　青岛市体育运动学校田径项目国家级教练兼山东省田径队总教练　　张德奎　青岛市第八人民医院院长助理兼大外科主任、主任医师　　陆　玲　青岛市群众艺术馆文艺部主任、副研究馆员　　陈　戈　中国海洋大学信息科学与工程学院院长、教授　　陈守国　青岛国泰集团有限公司、青岛海生肿瘤医院董事长　　陈西广　中国海洋大学海洋生命学院海洋生物系主任、教授　　陈松林　中国水产科学研究院黄海水产研究所农业部海洋渔业资源可持续利用重点开放实验室常务副主任、研究员　　陈振德　青岛市农业科学研究院党委副书记兼副院长、研究员　　陈索斌　青岛金王集团董事长、高级经济师　　陈常乐　青岛碱业股份有限公司计量仪表处化工仪表与自动化高级技师　　陈维强　青岛海信网络科技股份有限公司总经理、高级工程师　　邵永春　青岛市农业科学研究院副研究员　　迟登亮　中国人民解放军第四八○八工厂轮机车间船舶钳工班长、高级技师　　武鹏崑　青岛首创瑞海水务有限公司总经理、高级工程师　　林　琪　青岛农业大学农学与植物保护学院院长、教授　　林凤章　青岛双桃精细化工（集团）有限公司总经理、高级工程师　　苗志敏　青岛大学医学院附属医院院长、主任医师、教授　　罗　兵　青岛大学医学院微生物学教研室主任、教授　　金显仕　中国水产科学研究院黄海水产研究所副所长、研究员　　金道谟　青岛海尔新材料研发有限公司总经理、高级工程师　　周云杰　海尔集团公司副总裁、高级工程师　　周岩冰　青岛大学医学院附属医院普外科主任、主任医师、教授　　单若冰　青岛市妇女儿童医疗保健中心儿童医院副院长兼新生儿科主任、主任医师　　郑永允　山东省海水养殖研究所副所长、研究员　　郑生春　青岛市勘察测绘研究院副院长、工程技术应用研究员　　建方方　青岛科技大学发展规划处处长、教授　　相佃国　青岛第六十六中学副校长、中学高级教师　　柳学周　中国水产科学研究院黄海水产研究所海水鱼类养殖与设施渔业研究室研究员　　赵东生　中国保险监督管理委员会青岛监管局人身险监管处处长　　赵君财　海信电器股份公司产品引入中心总监、工程师　　赵其圣　海信宽带多媒体技术股份有限公司光模块研发部部长、工程师　　赵铁军　青岛理工大学副校长、教授　　战文斌　中国海洋大学生命科学与技术学部副主任、教授　　修新红　青岛市妇女儿童医疗保健中心妇幼保健所妇保科主任、副主任医师　　逄增昌　青岛市疾病预防控制中心公共卫生顾问、主任医师　　宣世英　青岛市市立医院副院长、主任医师　　姜正俊　青岛云龙纺织机械有限公司董事长、总经理、高级工程师　　姚　军　中国石油大学（华东）石油工程学院院长、教授　　耿以龙　青岛市森林病虫害防治工作站站长　　贾庆鹏　青岛出版社副总编辑、编审　　贾维敏　青岛市胶州建设集团有限公司工人、高级技师　　夏延致　青岛大学纤维新材料与现代纺织国家重点实验室培育基地副主任兼阻燃纤维研究所所长、图书馆馆长、教授　　柴永森　青岛海尔通信有限公司本部长、高级工程师　　徐　建　青岛市胶州中心医院副院长、主任医师　　徐万珉　青岛市社科联党组书记、主席，社科院院长　　徐明振　胶州市农业局总农艺师、高级农艺师　　徐青峰　青岛大学纺织服装学院服装研究所所长、副教授　　徐恭藻　利群集团股份有限公司董事局主席、总裁、高级经济师　　徐殿平　青岛市优秀运动队副队长兼国家女子柔道队领队、国家级教练　　郭　峰　青岛理工大学机械工程学院摩擦学研究所副所长、教授　　郭　锐　南车青岛四方机车车辆股份有限公司首席制造师、钳工高级技师　　郭育晖　市北区教研电教室副主任、小学高级教师　　郭爱青　青岛第十五中学教研组长、中学高级教师　　高汝钦　青岛市卫生监督局局长、主任医师　　栾少湖　德衡律师集团事务所主任　　黄　倢　中国水产科学研究院黄海水产研究所海水养殖生物疾病控制与病原分子生物学实验室主任、研究员　　黄婷婷　青岛市农业科学研究院蔬菜研究所副所长、研究员　　黄　港　青岛市话剧院副院长、国家一级导演　　曹茂永　山东科技大学信息与电气工程学院院长、教授　　曹健伟　青岛海信电器股份有限公司多媒体研发中心专业技术委员会副主任、平台所所长、液晶所所长、工程师　　龚鲁阳　青岛市民族艺术剧院院长助理兼吕剧工作室主任、国家一级演员　　常德传　青岛港（集团）有限公司董事局主席、总裁、高级经济师　　傅　平　青岛市妇女儿童医疗保健中心妇幼保健所副所长、主任医师　　隋学礼　青岛创统科技集团有限公司董事长、总裁　　韩方希　青岛滨海学院院长、副教授　　韩珍德　胶州市向阳路小学校长、中学高级教师　　葛方明　青岛捷能汽轮机集团股份有限公司董事长、总经理、高级经济师　　葛玉钦　胶州市洋河农牧产品研究开发协会会长、高级农艺师　　董　蒨　青岛大学医学院附属医院副院长兼儿科研究所所长、教授　　董晓光　山东省眼科研究所党委书记兼常务副所长、研究员、教授　　喻子达　海尔集团公司副总裁、高级工程师　　翟广顺　青岛市教育科学研究所所长、研究员　　翟翌立　青岛海尔电子有限公司总工程师　　戴淑真　青岛大学医学院附属医院妇产科主任、教授　　魏立青　青岛市公安局刑警支队技术处五科科长、高级工程师"  ;

		SummaryComputer sc = new SummaryComputer(200, true, null, content);

		TagContent tc = new TagContent("<begin>", "<end>");

		String[] split = query.split(" ");

		List<Keyword> keywords = new ArrayList<Keyword>();

		for (String kw : split) {
			if (!StringUtil.isBlank(kw)) {
				keywords.add(new Keyword(kw, 100.0d * kw.length()));
			}
		}

		String tagContent = tc.tagContent(sc.toSummary(keywords));

		System.out.println(tagContent);
	}
	
	@Test
	public void test3() {
		
		TagContent tc = new TagContent("<begin>", "<end>");


		String content = "您好,         1986年出国留学,2008年回国后 发现户口被注销(本人不知情),当时出国时还没有办理身份证,去入户派出所查询,只有入户的信息,其他材料一概没有,甚至没有所谓的注销情况之类(据说期间材料被转过三个派出所,最大可能是派出所转移时候遗失.现在是几个派出所互相推,) ,    1,这种情况我如何恢复户籍??没有身份证在中国处处不方便..    2,我有国外永久居留,如恢复的话是否可以保留?        谢谢" ;
		
		List<Keyword> keywords = new ArrayList<>() ;
		
		keywords.add(new Keyword("中国", 2d)) ;
		keywords.add(new Keyword("信息", 2d)) ;

		SummaryComputer sc = new SummaryComputer(22, true, "", content);
		String tagContent = tc.tagContent(sc.toSummary(keywords));

		System.out.println(tagContent);
	}

	@Test
	public void englishWordTest(){
		String query = "plasma";

		String content = "Aerodynamic Control of High Performance Aircraft Using Pulsed Plasma Actuators"  ;

		SummaryComputer sc = new SummaryComputer(200, true, null, content);

		TagContent tc = new TagContent("<begin>", "<end>");

		String[] split = query.split(" ");

		List<Keyword> keywords = new ArrayList<Keyword>();

		for (String kw : split) {
			if (!StringUtil.isBlank(kw)) {
				keywords.add(new Keyword(kw, 100.0d * kw.length()));
			}
		}
		
		String tagContent = tc.tagContent(sc.toSummary(keywords));

		System.out.println(tagContent);
	}



}
