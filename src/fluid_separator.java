{
   "format_version": "1.16.100",
   "minecraft:block": {
      "description": {
         "identifier": "vatonage:fluid_separator",
         "register_to_creative_menu": true,
         "properties": {
            "vatonage:on":[
               0,
               1
            ],
            "vatonage:cooldown":[
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
               13,
               14,
               15
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
         "minecraft:geometry": "geometry.gas_separator",
         "minecraft:destroy_time": 1,
         "tag:gas_cable": {},
         "tag:power_cable": {},
         "tag:fluid_cable": {},
         "minecraft:block_light_absorption": 0
      },
      "events":{
         "vatonage:powered4":{
             "randomize": [
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,-1,0,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~-1 ~ vatonage:gas_cable_hydrogen"
                                    ]
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,1,0,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~1 ~ vatonage:gas_cable_hydrogen"
                                    ]
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(1,0,0,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~1 ~ ~ vatonage:gas_cable_hydrogen"
                                    ]
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(-1,0,0,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~-1 ~ ~ vatonage:gas_cable_hydrogen"
                                    ]
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,1,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~1 vatonage:gas_cable_hydrogen"
                                    ]
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,-1,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~-1 vatonage:gas_cable_hydrogen"
                                    ]
                     }
                 }
             ]
         },
         "vatonage:powered":{
             "randomize": [
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,-1,0,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~-1 ~ vatonage:gas_cable_oxygen"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered4"
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,1,0,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~1 ~ vatonage:gas_cable_oxygen"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered4"
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(1,0,0,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~1 ~ ~ vatonage:gas_cable_oxygen"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered4"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(-1,0,0,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~-1 ~ ~ vatonage:gas_cable_oxygen"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered4"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,1,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~1 vatonage:gas_cable_oxygen"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered4"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,-1,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~-1 vatonage:gas_cable_oxygen"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered4"
                     }
                 }
             ]
         },
         "vatonage:powered2":{
             "randomize": [
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,-1,0,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~-1 ~ vatonage:gas_cable_carbon"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered4"
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,1,0,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~1 ~ vatonage:gas_cable_carbon"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered4"
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(1,0,0,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~1 ~ ~ vatonage:gas_cable_carbon"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered4"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(-1,0,0,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~-1 ~ ~ vatonage:gas_cable_carbon"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered4"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,1,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~1 vatonage:gas_cable_carbon"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered4"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,-1,'gased_cable')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~-1 vatonage:gas_cable_carbon"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered4"
                     }
                 }
             ]
         },
         "vatonage:powered3":{
            "sequence":[
                {
             "set_block_property": {
                "vatonage:on": 1
             }
                },
                {
             "set_block_property": {
                "vatonage:cooldown": 1
             }
                }
             ]
         },
         "vatonage:energy":{
             "randomize": [
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,-1,0,'water_fluid')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~-1 ~ vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered"
                     },
                    "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
                    }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,1,0,'water_fluid')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~1 ~ vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered"
                     },
                    "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
                    }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(1,0,0,'water_fluid')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~1 ~ ~ vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered"
                     },
                    "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
                    }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(-1,0,0,'water_fluid')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~-1 ~ ~ vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered"
                     },
                    "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
                    }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,1,'water_fluid')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~1 vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered"
                     },
                    "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
                    }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,-1,'water_fluid')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~-1 vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered"
                     },
                    "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
                    }
                 },

                 {
                     "condition": "q.block_neighbor_has_any_tag(0,-1,0,'oil_fluid')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~-1 ~ vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered2"
                     },
                    "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
                    }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,1,0,'oil_fluid')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~1 ~ vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered2"
                     },
                    "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
                    }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(1,0,0,'oil_fluid')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~1 ~ ~ vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered2"
                     },
                    "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
                    }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(-1,0,0,'oil_fluid')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~-1 ~ ~ vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered2"
                     },
                    "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
                    }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,1,'oil_fluid')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~1 vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered2"
                     },
                    "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
                    }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,-1,'oil_fluid')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~-1 vatonage:fluid_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered2"
                     },
                    "set_block_property": {
                      "vatonage:cooldown": "query.block_property('vatonage:cooldown')+1"
                    }
                 },
                {
                    "condition": "query.block_property('vatonage:cooldown') == 14",
                    "set_block_property": {
                       "vatonage:on": 0
                    }
                }
             ]
         },
         "vatonage:energy2":{
             "randomize": [
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,-1,0,'charged')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~-1 ~ vatonage:power_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered3"
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(0,1,0,'charged')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~1 ~ vatonage:power_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered3"
                     }
                 },
                 {
                    "condition": "q.block_neighbor_has_any_tag(1,0,0,'charged')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~1 ~ ~ vatonage:power_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered3"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(-1,0,0,'charged')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~-1 ~ ~ vatonage:power_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered3"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,1,'charged')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~1 vatonage:power_cable"
                                    ]
                     },
                     "trigger": {
                         "event": "vatonage:powered3"
                     }
                 },
                 {
                     "condition": "q.block_neighbor_has_any_tag(0,0,-1,'charged')",
                     "weight":1,
                     "run_command": {
                         "command": [
                                    "setblock ~ ~ ~-1 vatonage:power_cable"
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
            "condition":"query.block_property('vatonage:on') == 0",
            "components":{
               "minecraft:ticking": {
                  "looping": true,
                  "range": [ 0.19, 0.19 ],
                  "on_tick": {
                     "event": "vatonage:energy2",
                     "target": "self"
                  }
               },
               "minecraft:material_instances":{
                  "*":{
                     "texture":"fluid_separator",
                     "render_method":"alpha_test"
                  }
               }
            }
         },
         {
            "condition":"query.block_property('vatonage:on') == 1",
            "components":{
               "minecraft:material_instances":{
                  "*":{
                     "texture":"fluid_separator_on",
                     "render_method":"alpha_test"
                  }
               },
               "minecraft:ticking": {
                  "looping": true,
                  "range": [ 0.5, 0.5 ],
                  "on_tick": {
                     "event": "vatonage:energy",
                     "target": "self"
                  }
               }
            }
         }
      ]
   }
}
