package nickultracraft.protect.hooks.plugins.login;

import org.bukkit.Bukkit;

/**
 * Copyright 2019 NickUltracraft
 *
 * A class AuthMe.java pertence ao projeto (PLUGIN - nProtectV2) pertencente à NickUltracraft
 * Discord: NickUltracraft#4550
 * Mais informações: https://nickuc.tk 
 *
 * É expressamente proibído alterar o nome do proprietário do código, sem
 * expressar e deixar claramente o link para acesso da source original.
 *
 * Este aviso não pode ser removido ou alterado de qualquer distribuição de origem.
*/

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import fr.xephi.authme.events.LoginEvent;
import nickultracraft.protect.hooks.LoginAbstract;

public class AuthMe extends LoginAbstract implements Listener {
	
	public AuthMe() {
		super("AuthMe", Bukkit.getPluginManager().getPlugin("AuthMe").getDescription().getVersion());
	}
	@EventHandler
	public void onLogar(LoginEvent e) {
		callLogin(e.getPlayer());
	}
}
