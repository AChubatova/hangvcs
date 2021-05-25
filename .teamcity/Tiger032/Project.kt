package Tiger032

import Tiger032.buildTypes.*
import Tiger032.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger032")
    name = "Tiger032"

    vcsRoot(Tiger032_cVCSroot)

    buildType(Tiger032_Hi1)
    buildType(Tiger032_Hi0)
    buildType(Tiger032_Hi3)
    buildType(Tiger032_Hi2)
})
