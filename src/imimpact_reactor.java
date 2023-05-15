{
   "format_version": "1.16.100",
   "minecraft:block": {
      "description": {
         "identifier": "vatonage:imimpact_reactor",
         "register_to_creative_menu": true,
         "properties": {
            "vatonage:water":[
               0,
               1
            ],
            "vatonage:oxygen":[
               0,
               1
            ],
            "vatonage:carbon":[
               0,
               1
            ],
            "vatonage:cooldown":[
               0,
               1,
               2,
               3,
               4,
               5,
               6,
               7,
               8,
               9,
               10,
               11,
               12,
               13
            ]
         }
      },
      "components": {
         "minecraft:creative_category": {
		"category": "construction"
	},
         "minecraft:pick_collision": {
             "origin":  [-8, 0, -8],
             "size":    [16, 16, 16]
         },
         "minecraft:entity_collision": {
             "origin":  [-8, 0, -8],
             "size":    [16, 16, 16]
         },
         "minecraft:geometry": "geometry.imimpact_reactor",
         "minecraft:destroy_time": 1,
         "tag:power_cable": {},
         "minecraft:part_visibility": {
             "rules": {
                 "water": "q.block_property('vatonage:water') == 1",
                 "oxygen": "q.block_property('vatonage:oxygen') == 1",
                 "carbon": "q.block_property('vatonage:carbon') == 1"
             }
         },
         "tag:fluid_cable": {},
         "tag:gas_cable": {},
         "minecraft:block_light_absorption": 0,
               "minecraft:material_instances":{
                  "*":{
                     "texture":"imimpact_reactor",
                     "render_method":"alpha_test"
                  }
               }
      },
      "events":{
         "vatonage:generate": {
             "randomize": [
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,-1,0,'powered_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~-1 ~ vatonage:powered_cable2"
                                    ]
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,1,0,'powered_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~1 ~ vatonage:powered_cable2"
                                    ]
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(1,0,0,'powered_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~1 ~ ~ vatonage:powered_cable2"
                                    ]
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(-1,0,0,'powered_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~-1 ~ ~ vatonage:powered_cable2"
                                    ]
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,1,'powered_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~1 vatonage:powered_cable2"
                                    ]
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,-1,'powered_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~-1 vatonage:powered_cable2"
                                    ]
                     }
                 },
                {
                    "condition": "query.block_property('vatonage:cooldown') >= 4",
                    "set_block_property": {
                "vatonage:carbon": 0,
                "vatonage:water": 0,
                "vatonage:oxygen": 0,
                "vatonage:cooldown": 0
                    }
                }
             ]
         },
         "vatonage:place":{
            "set_block_property":{
               "vatonage:data":"(query.cardinal_facing_2d)"
            }
         },
         "vatonage:powered":{
             "set_block_property": {
                "vatonage:water": 1
             }
         },
         "vatonage:powered2":{
             "set_block_property": {
                "vatonage:oxygen": 1
             }
         },
         "vatonage:powered3":{
             "set_block_property": {
                "vatonage:carbon": 1
             }
         },
         "vatonage:powered4":{
             "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
             },
                     "trigger": {
                         "event": "vatonage:generate"
                     }
         },
         "vatonage:auto":{
             "randomize": [
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,-1,0,'water_fluid') && query.block_property('vatonage:water') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~-1 ~ vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered"
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,1,0,'water_fluid') && query.block_property('vatonage:water') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~1 ~ vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered"
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(1,0,0,'water_fluid') && query.block_property('vatonage:water') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~1 ~ ~ vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(-1,0,0,'water_fluid') && query.block_property('vatonage:water') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~-1 ~ ~ vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,1,'water_fluid') && query.block_property('vatonage:water') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~1 vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,-1,'water_fluid') && query.block_property('vatonage:water') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~-1 vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered"
                     }
                 },

                 {
                     "condition": "q.block_neighbor_has_any_tag(0,-1,0,'oxygen_gas') && query.block_property('vatonage:oxygen') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~-1 ~ vatonage:gas_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered2"
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,1,0,'oxygen_gas') && query.block_property('vatonage:oxygen') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~1 ~ vatonage:gas_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered2"
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(1,0,0,'oxygen_gas') && query.block_property('vatonage:oxygen') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~1 ~ ~ vatonage:gas_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered2"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(-1,0,0,'oxygen_gas') && query.block_property('vatonage:oxygen') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~-1 ~ ~ vatonage:gas_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered2"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,1,'oxygen_gas') && query.block_property('vatonage:oxygen') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~1 vatonage:gas_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered2"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,-1,'oxygen_gas') && query.block_property('vatonage:oxygen') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~-1 vatonage:gas_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered2"
                     }
                 },

                 {
                     "condition": "q.block_neighbor_has_any_tag(0,-1,0,'carbon_gas') && query.block_property('vatonage:carbon') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~-1 ~ vatonage:gas_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered3"
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,1,0,'carbon_gas') && query.block_property('vatonage:carbon') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~1 ~ vatonage:gas_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered3"
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(1,0,0,'carbon_gas') && query.block_property('vatonage:carbon') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~1 ~ ~ vatonage:gas_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered3"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(-1,0,0,'carbon_gas') && query.block_property('vatonage:carbon') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~-1 ~ ~ vatonage:gas_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered3"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,1,'carbon_gas') && query.block_property('vatonage:carbon') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~1 vatonage:gas_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered3"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,-1,'carbon_gas') && query.block_property('vatonage:carbon') == 0",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~-1 vatonage:gas_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered3"
                     }
                 }
             ]
         }
      },
      "permutations":[
         {
            "condition":"query.block_property('vatonage:water') == 0 || query.block_property('vatonage:oxygen') == 0 || query.block_property('vatonage:carbon') == 0",
            "components":{
               "minecraft:ticking": {
                  "looping": true,
                  "range": [ 0.4, 0.4 ],
                  "on_tick": {
                     "event": "vatonage:auto",
                     "target": "self"
                  }
               }
            }
         },
         {
            "condition":"query.block_property('vatonage:water') == 1 && query.block_property('vatonage:oxygen') == 1 && query.block_property('vatonage:carbon') == 1",
            "components":{
               "minecraft:ticking": {
                  "looping": true,
                  "range": [ 2, 2 ],
                  "on_tick": {
                     "event": "vatonage:powered4",
                     "target": "self"
                  }
               }
            }
         }
      ]
   }
}
