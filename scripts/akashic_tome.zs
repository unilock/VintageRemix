// AkashicTome

import mods.initialinventory.InvHandler;

val akashicTome = <item:akashictome:tome>.withTag(
	{
		"akashictome:data": {
			"academy": {
				"Count": 1,
				"Damage": 0,
				"id": "academy:tutorial",
				"tag": {
					"akashictome:definedMod": "academy"
				}
			},
			"arcanearchives": {
				"Count": 1,
				"Damage": 0,
				"id": "arcanearchives:tome_arcana",
				"tag": {
					"akashictome:definedMod": "arcanearchives",
					"Book": "arcanearchives:xml/tome.xml"
				}
			},
			"bloodarsenal": {
				"Count": 1,
				"Damage": 0,
				"id": "guideapi:bloodarsenal-guide",
				"tag": {
					"akashictome:definedMod": "bloodarsenal"
				}
			},
			"buildcraftlib": {
				"Count": 1,
				"Damage": 0,
				"id": "buildcraftlib:guide",
				"tag": {
					"akashictome:definedMod": "buildcraftlib"
				}
			},
			"correlated": {
				"Count": 1,
				"Damage": 0,
				"id": "correlated:doc_tablet",
				"tag": {
					"akashictome:definedMod": "correlated"
				}
			},
			"divinefavor": {
				"Count": 1,
				"Damage": 0,
				"id": "patchouli:guide_book",
				"tag": {
					"akashictome:definedMod": "divinefavor",
					"patchouli:book": "divinefavor:immaterial_guide"
				}
			},
			"ee": {
				"Count": 1,
				"Damage": 0,
				"id": "ee:end_info_book",
				"tag": {
					"akashictome:definedMod": "ee"
				}
			},
			"elementaristics": {
				"Count": 1,
				"Damage": 0,
				"id": "patchouli:guide_book",
				"tag": {
					"akashictome:definedMod": "elementaristics",
					"patchouli:book": "elementaristics:liber_elementium"
				}
			},
			"engineersdecor": {
				"Count": 1,
				"Damage": 0,
				"id": "patchouli:guide_book",
				"tag": {
					"akashictome:definedMod": "engineersdecor",
					"patchouli:book": "engineersdecor:engineersdecor_manual"
				}
			},
			"essentialcraft": {
				"Count": 1,
				"Damage": 0,
				"id": "essentialcraft:research_book",
				"tag": {
					"akashictome:definedMod": "essentialcraft",
				}
			},
			"extrautils2": {
				"Count": 1,
				"Damage": 0,
				"id": "extrautils2:book",
				"tag": {
					"akashictome:definedMod": "extrautils2"
				}
			},
			"forestry": {
				"Count": 1,
				"Damage": 0,
				"id": "forestry:book_forester",
				"tag": {
					"akashictome:definedMod": "forestry"
				}
			},
			"lordcraft": {
				"Count": 1,
				"Damage": 0,
				"id": "lordcraft:knowledge_book",
				"tag": {
					"akashictome:definedMod": "lordcraft"
				}
			},
			"magicalsculpture": {
				"Count": 1,
				"Damage": 0,
				"id": "magicalsculpture:userguide",
				"tag": {
					"akashictome:definedMod": "magicalsculpture"
				}
			},
			"naturesaura": {
				"Count": 1,
				"Damage": 0,
				"id": "patchouli:guide_book",
				"tag": {
					"akashictome:definedMod": "naturesaura",
					"patchouli:book": "naturesaura:book"
				}
			},
			"opencomputers": {
				"Count": 1,
				"Damage": 4,
				"id": "opencomputers:tool",
				"tag": {
					"akashictome:definedMod": "opencomputers"
				}
			},
			"patchoulibooks": {
				"Count": 1,
				"Damage": 0,
				"id": "patchouli:guide_book",
				"tag": {
					"akashictome:definedMod": "patchoulibooks",
					"patchouli:book": "patchoulibooks:gendustry"
				}
			},
			"patchoulibooks1": {
				"Count": 1,
				"Damage": 0,
				"id": "patchouli:guide_book",
				"tag": {
					"akashictome:definedMod": "patchoulibooks",
					"patchouli:book": "patchoulibooks:patchoulibooks"
				}
			},
			"practicallogistics2": {
				"Count": 1,
				"Damage": 0,
				"id": "practicallogistics2:plguide",
				"tag": {
					"akashictome:definedMod": "practicallogistics2"
				}
			},
			"quiverbow_restrung": {
				"Count": 1,
				"Damage": 0,
				"id": "patchouli:guide_book",
				"tag": {
					"akashictome:definedMod": "quiverbow_restrung",
					"patchouli:book": "quiverbow_restrung:weaponsmiths_journal"
				}
			},
			"roots": {
				"Count": 1,
				"Damage": 0,
				"id": "roots:roots_guide",
				"tag": {
					"akashictome:definedMod": "roots"
				}
			},
			"runesofwizardry": {
				"Count": 1,
				"Damage": 0,
				"id": "guideapi:runesofwizardry-guide_book",
				"tag": {
					"akashictome:definedMod": "runesofwizardry"
				}
			},
			"thebetweenlands": {
				"Count": 1,
				"Damage": 0,
				"id": "thebetweenlands:manual_hl",
				"tag": {
					"akashictome:definedMod": "thebetweenlands"
				}
			},
			"tis3d": {
				"Count": 1,
				"Damage": 0,
				"id": "tis3d:book_manual",
				"tag": {
					"akashictome:definedMod": "tis3d"
				}
			},
			"twilightforest": {
				"Count": 1,
				"Damage": 0,
				"id": "patchouli:guide_book",
				"tag": {
					"akashictome:definedMod": "twilightforest",
					"patchouli:book": "twilightforest:guide"
				}
			},
			"uniquecrops": {
				"Count": 1,
				"Damage": 0,
				"id": "uniquecrops:generic",
				"tag": {
					"akashictome:definedMod": "uniquecrops"
				}
			},
			"uniquecrops1": {
				"Count": 1,
				"Damage": 0,
				"id": "uniquecrops:bookmultiblock",
				"tag": {
					"akashictome:definedMod": "uniquecrops"
				}
			},
			"witchery": {
				"Count": 1,
				"Damage": 0,
				"id": "witchery:brews_and_infusions_book",
				"tag": {
					"akashictome:definedMod": "witchery"
				}
			},
			"witchery1": {
				"Count": 1,
				"Damage": 0,
				"id": "witchery:circle_magic_book",
				"tag": {
					"akashictome:definedMod": "witchery"
				}
			},
			"witchery2": {
				"Count": 1,
				"Damage": 0,
				"id": "witchery:collecting_fumes_book",
				"tag": {
					"akashictome:definedMod": "witchery"
				}
			},
			"witchery3": {
				"Count": 1,
				"Damage": 0,
				"id": "witchery:conjuration_and_fetishes_book",
				"tag": {
					"akashictome:definedMod": "witchery"
				}
			},
			"witchery4": {
				"Count": 1,
				"Damage": 0,
				"id": "witchery:distilling_book",
				"tag": {
					"akashictome:definedMod": "witchery"
				}
			},
			"witchery5": {
				"Count": 1,
				"Damage": 0,
				"id": "witchery:herbology_book",
				"tag": {
					"akashictome:definedMod": "witchery"
				}
			},
			"witchery6": {
				"Count": 1,
				"Damage": 0,
				"id": "witchery:symbology_book",
				"tag": {
					"akashictome:definedMod": "witchery"
				}
			},
			"witcherycompanion": {
				"Count": 1,
				"Damage": 0,
				"id": "patchouli:guide_book",
				"tag": {
					"akashictome:definedMod": "witcherycompanion",
					"patchouli:book": "witcherycompanion:witches_companion"
				}
			},
			"wizardry": {
				"Count": 1,
				"Damage": 0,
				"id": "wizardry:book",
				"tag": {
					"akashictome:definedMod": "wizardry"
				}
			},
			"woot": {
				"Count": 1,
				"Damage": 0,
				"id": "guideapi:woot-guide",
				"tag": {
					"akashictome:definedMod": "woot"
				}
			}
		}
	}
);

InvHandler.addStartingItem(akashicTome, 9);
InvHandler.addStartingItem(<item:astralsorcery:itemjournal>, 10);
InvHandler.addStartingItem(<item:alquimia:lexicon>, 11);
InvHandler.addStartingItem(<item:botania:lexicon>, 12);
