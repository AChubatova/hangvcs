package Tiger011

import Tiger011.buildTypes.*
import Tiger011.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger011")
    name = "Tiger011"

    vcsRoot(Tiger011_cVCSroot)

    buildType(Tiger011_Hi0)
    buildType(Tiger011_Hi2)
    buildType(Tiger011_Hi1)
    buildType(Tiger011_Hi3)
})
