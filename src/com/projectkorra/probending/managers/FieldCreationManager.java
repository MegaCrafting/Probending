/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectkorra.probending.managers;

import com.projectkorra.probending.PBMessager;
import com.projectkorra.probending.objects.ProbendingField;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 *
 * @author Ivo
 */
public class FieldCreationManager implements Listener {

    private final ProbendingHandler pHandler;

    private Player creator;
    private ProbendingField field;

    private Integer bigStep;
    private Integer smallStep;

    public FieldCreationManager(ProbendingHandler pHandler) {
        this.pHandler = pHandler;
    }

    public void setFieldSpawn(Player player, String field, String team, String point) {
        ProbendingField f = pHandler.getField(player, field);
        if (f != null) {
            switch (team.toLowerCase()) {
                case "1":
                    switch (point.toLowerCase()) {
                        case "1":
                            f.setStartPointTeam1(1, player.getLocation());
                            //TODO: DB > Save data
                            break;
                        case "2":
                            f.setStartPointTeam1(2, player.getLocation());
                            //TODO: DB > Save data
                            break;
                        case "3":
                            f.setStartPointTeam1(3, player.getLocation());
                            //TODO: DB > Save data
                            break;
                        default:
                            PBMessager.sendMessage(player, "No such region, 1, 2 and 3 are the options!", true);
                            return;
                    }
                    break;
                case "2":
                    switch (point.toLowerCase()) {
                        case "1":
                            f.setStartPointTeam2(1, player.getLocation());
                            //TODO: DB > Save data
                            break;
                        case "2":
                            f.setStartPointTeam2(2, player.getLocation());
                            //TODO: DB > Save data
                            break;
                        case "3":
                            f.setStartPointTeam2(3, player.getLocation());
                            //TODO: DB > Save data
                            break;
                        default:
                            PBMessager.sendMessage(player, "No such region, 1, 2 and 3 are the options!", true);
                            return;
                    }
                    break;
                default:
                    PBMessager.sendMessage(player, "No such team, try 1 or 2 for [team]", true);
                    return;
            }
            PBMessager.sendMessage(player, "Data has been succesfully set!", true);
        }
    }

    public void setFieldRegionSpawn(Player player, String field, String team, String point) {
        ProbendingField f = pHandler.getField(player, field);
        if (f != null) {
            switch (team.toLowerCase()) {
                case "1":
                    switch (point.toLowerCase()) {
                        case "1":
                            f.setTeam1Location1(player.getLocation());
                            //TODO: DB > Save data
                            break;
                        case "2":
                            f.setTeam1Location2(player.getLocation());
                            //TODO: DB > Save data
                            break;
                        case "3":
                            f.setTeam1Location3(player.getLocation());
                            //TODO: DB > Save data
                            break;
                        default:
                            PBMessager.sendMessage(player, "No such region, 1, 2 and 3 are the options!", true);
                            return;
                    }
                    break;
                case "2":
                    switch (point.toLowerCase()) {
                        case "1":
                            f.setTeam2Location1(player.getLocation());
                            //TODO: DB > Save data
                            break;
                        case "2":
                            f.setTeam2Location2(player.getLocation());
                            //TODO: DB > Save data
                            break;
                        case "3":
                            f.setTeam2Location3(player.getLocation());
                            //TODO: DB > Save data
                            break;
                        default:
                            PBMessager.sendMessage(player, "No such region, 1, 2 and 3 are the options!", true);
                            return;
                    }
                    break;
                default:
                    PBMessager.sendMessage(player, "No such team, try 1 or 2 for [team]", true);
                    return;
            }
            PBMessager.sendMessage(player, "Data has been succesfully set!", true);
        }
    }

    public void setFieldRegionName(Player player, String field, String team, String point, String name) {
        ProbendingField f = pHandler.getField(player, field);
        if (f != null) {
            switch (team.toLowerCase()) {
                case "1":
                    switch (point.toLowerCase()) {
                        case "1":
                            f.setTeam1Field1(name);
                            //TODO: DB > Save data
                            break;
                        case "2":
                            f.setTeam1Field2(name);
                            //TODO: DB > Save data
                            break;
                        case "3":
                            f.setTeam1Field3(name);
                            //TODO: DB > Save data
                            break;
                        default:
                            PBMessager.sendMessage(player, "No such region, 1, 2 and 3 are the options!", true);
                            return;
                    }
                    break;
                case "2":
                    switch (point.toLowerCase()) {
                        case "1":
                            f.setTeam2Field1(name);
                            //TODO: DB > Save data
                            break;
                        case "2":
                            f.setTeam2Field2(name);
                            //TODO: DB > Save data
                            break;
                        case "3":
                            f.setTeam2Field3(name);
                            //TODO: DB > Save data
                            break;
                        default:
                            PBMessager.sendMessage(player, "No such region, 1, 2 and 3 are the options!", true);
                            return;
                    }
                    break;
                default:
                    PBMessager.sendMessage(player, "No such team, try 1 or 2 for [team]", true);
                    return;
            }
            PBMessager.sendMessage(player, "Data has been succesfully set!", true);
        }
    }

    public void setKnockOffName(Player player, String field, String name) {
        ProbendingField f = pHandler.getField(player, field);
        if (f != null) {
            f.setKnockOffArea(name);
            PBMessager.sendMessage(player, "Data has been succesfully set!", true);
            //TODO: DB > Save data
        }
    }

    //TODO: ALL FIELD, THE ONE IN USE AND NOT IN USE!
    public void getFields(Player player) {
        PBMessager.sendMessage(player, "NOT IMPLEMENTED YET!", true);
    }

    //TODO: GET ALL FIELD INFO NICE IN CHAT!
    public void getFieldInfo(Player player, String field) {
        ProbendingField f = pHandler.getField(player, field);
        if (f != null) {
            PBMessager.sendMessage(player, "NOT IMPLEMENTED YET!", true);
        }
    }

    public void deleteField(Player player, String field) {
        ProbendingField f = pHandler.getField(player, field);
        if (f != null) {
            pHandler.removeField(f);
            PBMessager.sendMessage(player, "Field has been succesfully deleted", true);
        }
    }

    public void createField(Player player) {
        if (creator != null) {
            return;
        }
        bigStep = 0;
        smallStep = 1;
        creator = player;
        field = new ProbendingField();
        createFieldStep(player, null);
    }

    private void createFieldStep(Player player, String arg) {
        if (creator == null) {
            createField(player);
            return;
        }
        switch (bigStep) {
            case 0:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "Are you sure you want to create an arena?");
                    sendMessage(player, ChatColor.YELLOW + "When you create an arena, you cannot talk!");
                    sendMessage(player, ChatColor.YELLOW + "If you have a " + ChatColor.RED + "red" + ChatColor.YELLOW
                            + " and " + ChatColor.BLUE + "blue" + ChatColor.YELLOW + " probending field, keep in mind, "
                            + ChatColor.BLUE + "team1 is blue" + ChatColor.YELLOW + " and " + ChatColor.RED + "team 2 is red");
                    sendMessage(player, "Options: [yes, no]");
                } else {
                    if (arg.equalsIgnoreCase("yes")) {
                        bigStep++;
                        sendMessage(player, "Next few steps will be the basic probending fields!");
                        createFieldStep(player, null);
                    } else if (arg.equalsIgnoreCase("no")) {
                        stopCreating(player);
                    } else {
                        sendMessage(player, "Options: [yes, no]");
                    }
                }
                break;
            case 1:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "Stand on the location of team " + ChatColor.RED + "1" + ChatColor.YELLOW
                            + " spawn of player " + ChatColor.RED + smallStep + ChatColor.YELLOW + ", and type 'here'");
                } else {
                    if (arg.equalsIgnoreCase("here")) {
                        field.setStartPointTeam1(smallStep, player.getLocation());
                        smallStep++;
                        if (smallStep > 3) {
                            bigStep++;
                            smallStep = 1;
                        }
                        createFieldStep(player, null);
                    } else {
                        sendMessage(player, "Options: [here]");
                    }
                }
                break;
            case 2:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "Stand on the location of team " + ChatColor.RED + "2" + ChatColor.YELLOW
                            + " spawn of player " + ChatColor.RED + smallStep + ChatColor.YELLOW + ", and type 'here'");
                } else {
                    if (arg.equalsIgnoreCase("here")) {
                        field.setStartPointTeam2(smallStep, player.getLocation());
                        smallStep++;
                        if (smallStep > 3) {
                            bigStep++;
                            smallStep = 1;
                        }
                        createFieldStep(player, null);
                    } else {
                        sendMessage(player, "Options: [here]");
                    }
                }
                break;
            case 3:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "Now tell me, where is the teleport location " + ChatColor.RED + smallStep + ChatColor.YELLOW + "/region for team "
                            + ChatColor.RED + "1");
                    sendMessage(player, ChatColor.GRAY + "region 1 = The nearest to the middle, region 3 = the last part before they fall off, "
                            + "region 4 = the location where they should be teleported then they fall off!");
                } else {
                    if (arg.equalsIgnoreCase("here")) {
                        switch (smallStep) {
                            case 1:
                                smallStep++;
                                field.setTeam1Location1(player.getLocation());
                                createFieldStep(player, null);
                                break;
                            case 2:
                                smallStep++;
                                field.setTeam1Location2(player.getLocation());
                                createFieldStep(player, null);
                                break;
                            case 3:
                                smallStep++;
                                field.setTeam1Location3(player.getLocation());
                                createFieldStep(player, null);
                                break;
                            case 4:
                                smallStep = 1;
                                bigStep++;
                                field.setTeam1KnockedOffLocation(player.getLocation());
                                createFieldStep(player, null);
                                break;
                        }
                    } else {
                        sendMessage(player, "Options: [here]");
                    }
                }
                break;
            case 4:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "Now tell me, where is the teleport location " + ChatColor.RED + smallStep + ChatColor.YELLOW + "/region for team "
                            + ChatColor.RED + "2");
                    sendMessage(player, ChatColor.GRAY + "region 1 = The nearest to the middle, region 3 = the last part before they fall off, "
                            + "region 4 = the location where they should be teleported then they fall off!");
                } else {
                    if (arg.equalsIgnoreCase("here")) {
                        switch (smallStep) {
                            case 1:
                                smallStep++;
                                field.setTeam2Location1(player.getLocation());
                                createFieldStep(player, null);
                                break;
                            case 2:
                                smallStep++;
                                field.setTeam2Location2(player.getLocation());
                                createFieldStep(player, null);
                                break;
                            case 3:
                                smallStep++;
                                field.setTeam2Location3(player.getLocation());
                                createFieldStep(player, null);
                                break;
                            case 4:
                                smallStep = 1;
                                bigStep++;
                                field.setTeam2KnockedOffLocation(player.getLocation());
                                createFieldStep(player, null);
                                break;
                        }
                    } else {
                        sendMessage(player, "Options: [here]");
                    }
                }
                break;
            case 5:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "What's the name of team 1, region 1. [WG region, example: 'PB1Team1RG1']");
                    sendMessage(player, ChatColor.GRAY + "region 1 = The nearest to the middle, region 3 = the last part before they fall off");
                } else {
                    field.setTeam1Field1(arg);
                    bigStep++;
                    createFieldStep(player, null);
                }
                break;
            case 6:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "What's the name of team 1, region 2. [WG region, example: 'PB1Team1RG2']");
                    sendMessage(player, ChatColor.GRAY + "region 1 = The nearest to the middle, region 3 = the last part before they fall off");
                } else {
                    field.setTeam1Field2(arg);
                    bigStep++;
                    createFieldStep(player, null);
                }
                break;
            case 7:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "What's the name of team 1, region 3. [WG region, example: 'PB1Team1RG3']");
                    sendMessage(player, ChatColor.GRAY + "region 1 = The nearest to the middle, region 3 = the last part before they fall off");
                } else {
                    field.setTeam1Field3(arg);
                    bigStep++;
                    createFieldStep(player, null);
                }
                break;
            case 8:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "What's the name of team 2, region 1. [WG region, example: 'PB1Team2RG1']");
                    sendMessage(player, ChatColor.GRAY + "region 1 = The nearest to the middle, region 3 = the last part before they fall off");
                } else {
                    field.setTeam2Field1(arg);
                    bigStep++;
                    createFieldStep(player, null);
                }
                break;
            case 9:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "What's the name of team 2, region 2. [WG region, example: 'PB1Team2RG2']");
                    sendMessage(player, ChatColor.GRAY + "region 1 = The nearest to the middle, region 3 = the last part before they fall off");
                } else {
                    field.setTeam2Field2(arg);
                    bigStep++;
                    createFieldStep(player, null);
                }
                break;
            case 10:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "What's the name of team 2, region 3. [WG region, example: 'PB1Team2RG3']");
                    sendMessage(player, ChatColor.GRAY + "region 1 = The nearest to the middle, region 3 = the last part before they fall off");
                } else {
                    field.setTeam2Field3(arg);
                    bigStep++;
                    createFieldStep(player, null);
                }
                break;
            case 11:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "What's the name of the knocked off region. [WG region, example: 'PB1KnockOff']");
                    sendMessage(player, ChatColor.GRAY + "A region below the arena, where they fall through");
                } else {
                    field.setKnockOffArea(arg);
                    finishCreating(player);
                }
                break;
            case 12:
                if (arg == null) {
                    sendMessage(player, ChatColor.YELLOW + "What is the name of this Probending Field?");
                } else {
                    field.setFieldName(arg);
                    finishCreating(player);
                }
        }
    }

    private void stopCreating(Player player) {
        sendMessage(player, "See you next time!");
        creator = null;
    }

    private void finishCreating(Player player) {
        sendMessage(player, "Awesome, thank you so much for creating the probending arena!");
        this.pHandler.addField(field);
        this.creator = null;
    }

    private void sendMessage(Player player, String message) {
        player.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "FieldManager" + ChatColor.GOLD + "]" + ChatColor.WHITE + " " + message);
    }

    @EventHandler
    private void playerTalk(AsyncPlayerChatEvent event) {
        if (creator == null) {
            return;
        }
        if (creator.equals(event.getPlayer())) {
            createFieldStep(event.getPlayer(), event.getMessage());
            event.setCancelled(true);
        }
    }

    @EventHandler
    private void playerQuit(PlayerQuitEvent event) {
        if (creator == null) {
            return;
        }
        if (creator.equals(event.getPlayer())) {
            creator = null;
        }
    }
}