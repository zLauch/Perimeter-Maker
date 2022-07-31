__config() -> {'stay_loaded' -> false};

__command()->(
    _p();
);

_p()->(
    player=player();

    x=query(player,'x');
    z=query(player,'z');

    x1 = round(x) + 150;
    x2 = round(x) - 150;

    z1 = round(z) + 150;
    z2 = round(z) - 150;

    run('carpet fillUpdates false');
    run('carpet fillLimit 1000000');

    i=4;
    for(range(5,256),
        i=i+1;

        run('fill '+x1+' '+i+' '+z1+' '+x2+' '+i+' '+z2+' air');

        print('y'+i+' just got removed.');
    );

    print(' ');
    print('--------------------------');
    print(' ');

    j=0;
    for(range(0,5),
        j=j+1;

        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace stone');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace andesite');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace granite');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace diorite');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace dirt');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace gravel');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace iron_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace gold_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace coal_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace redstone_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace diamond_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace lapis_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace emerald_ore');
                run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace deepslate_iron_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace deepslate_gold_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace deepslate_coal_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace deepslate_redstone_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace deepslate_diamond_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace deepslate_lapis_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace deepslate_emerald_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace deepslate_copper_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace copper_ore');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace water');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace lava');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace obsidian');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace sand');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace red_sand');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace infested_stone');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace infested_cobblestone');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace infested_stone_bricks');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace infested_mossy_stone_bricks');
        run('fill '+x1+' '+j+' '+z1+' '+x2+' '+j+' '+z2+' air replace infested_cracked_stone_bricks');

        print('y'+j+' just got cleaned.');
    );
    print(' ');
    print('--------------------------');
    print(' ');

    run('setblock '+round(x)+' '+64+' '+round(z)+' diamond_block');
    print('Diamond block has been created. at '+round(x)+' 64 '+round(z)+'.');
    print(' ');
    print('--------------------------');
    print(' ');

    run('carpet fillUpdates true');
    run('carpet fillLimit 32768');
    print('All done. Enjoy your new perimeter!');
    print(' ');
    print('--------------------------');
    print(' ');
);
